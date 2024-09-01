package com.aruntech.quality;

import java.util.Date;
import java.util.List;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;

public class LogFileProcessor {
    private List<String> errorLogMessages;
    private final String DATE_FORMAT = "dd-MMM-yyyy HH:mm:ss";
    private final String FILE_PATH = "src/main/java/com/aruntech/quality/logs/app.log";
    private final String DATE_REGEX_FORMAT = "[0-9]{2}-[A-za-z]{3}-[0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2}";

    public LogFileProcessor() throws Exception {
        loadLogFileAndExtractErrorMessages(FILE_PATH);
    }

    public LogFileProcessor(final String path) throws Exception {
        loadLogFileAndExtractErrorMessages(path);
    }

    public List<String> getErrorLogs(Date from, Date to) throws Exception {
        List<String> errorMessagesWithinRange;
        if(errorLogMessages != null && errorLogMessages.size() > 0) {
            errorMessagesWithinRange = new ArrayList<>();
            for(String line:errorLogMessages) {
                if(checkDateRange(line, from, to)) {
                    errorMessagesWithinRange.add(line);
                }
            }
        } else {
            throw new RuntimeException("There is no error message to process");
        }
        return errorMessagesWithinRange;
    }

    private boolean checkDateRange(String errorLine, Date from, Date to) throws Exception {
        if(errorLine != null || errorLine.trim() != "") {
            Pattern pattern = Pattern.compile(DATE_REGEX_FORMAT);
            Matcher matcher = pattern.matcher(errorLine);
            while (matcher.find()) {
                String dateStr = matcher.group();
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                Date date = dateFormat.parse(dateStr);
                if(date.after(from) && date.before(to) || date.equals(from)
                    || date.equals(to)) {
                    return true;
                }
            }
            return false;
        } else {
            throw new RuntimeException("unable to process the error line");
        }
    }

    private void loadLogFileAndExtractErrorMessages(final String path) throws FileNotFoundException {
        if(!path.isEmpty() && path.trim() != "") {
            try(BufferedReader br = new BufferedReader(new FileReader(path))) {
                //filter the Error messages from the log file
                errorLogMessages = br.lines()
                        .filter(line -> line.indexOf("ERROR") > 0)
                        .collect(Collectors.toList());
                System.out.println(errorLogMessages);
                int count = errorLogMessages.size();
                System.out.println("Count -->"+count);
            } catch(Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        } else {
            throw new RuntimeException("Path is not a valid one");
        }
    }

    public static void main(String[] args) throws Exception {
        LogFileProcessor logFileProcessor = new LogFileProcessor();
        String startDate = "31-Dec-2021 15:28:00";
        String endDate = "31-Dec-2021 23:12:50";
        SimpleDateFormat formatter = new SimpleDateFormat(logFileProcessor.DATE_FORMAT);
        Date from = formatter.parse(startDate);
        Date to = formatter.parse(endDate);

        List<String> errorsWithinRange = logFileProcessor.getErrorLogs(from, to);
        System.out.println(String.join(",", errorsWithinRange));
    }

}
