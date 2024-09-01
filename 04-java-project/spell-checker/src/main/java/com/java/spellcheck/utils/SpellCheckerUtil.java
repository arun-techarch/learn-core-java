package com.java.spellcheck.utils;

import java.io.File;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.java.spellcheck.processor.SpellCheckProcessor;
import com.java.spellcheck.exception.SpellCheckerException;

public class SpellCheckerUtil {
	private static String DICTIONARY_FILE_PATH = "src/main/resources/dictionary.txt";
	private static String WORD_PATTERN_STRING = "\\w+";
	private static SpellCheckProcessor spellCheckProcessor;
	
	public static ISpellChecker getSpellChecker(SpellCheckerType type) throws SpellCheckerException {
		ISpellChecker spellChecker = null;
		
		try{
			if(spellCheckProcessor == null){
				spellCheckProcessor = SpellCheckProcessor.getInstance(getDictionaryWordList());
			}
			
			if(type == SpellCheckerType.WORDS) {
				spellChecker = new WordSpellChecker(spellCheckProcessor);
			} else if(type == SpellCheckerType.LIST) {
				spellChecker = new ListSpellChecker(spellCheckProcessor);
			} else if(type == SpellCheckerType.FILE) {
				spellChecker = new FileSpellChecker(spellCheckProcessor);
			}
			return spellChecker;
		}catch(SpellCheckerException ex){
			throw new SpellCheckerException("problem in loading dictionary file", ex);
		}
	}
	
	public static HashMap<String, Integer> getDictionaryWordList() throws SpellCheckerException {
		return getAllWordsList(DICTIONARY_FILE_PATH);
	}
	
	public static HashMap<String, Integer> getSearchWordList(String filePath) throws SpellCheckerException {
		return getAllWordsList(filePath);
	}
	
	private static HashMap<String, Integer> getAllWordsList(String filePath) throws SpellCheckerException {
		BufferedReader bufferReader = null;
		HashMap<String, Integer> searchWords = new HashMap<String, Integer>();
		
		try {
			File file = new File(filePath);
			bufferReader = new BufferedReader(new FileReader(file));
			Pattern pattern = Pattern.compile(WORD_PATTERN_STRING);
			for(String word = ""; word != null; word = bufferReader.readLine()) {
				Matcher matcher = pattern.matcher(word.toLowerCase());
				while(matcher.find()) {
					searchWords.put((word = matcher.group()), searchWords.containsKey(word) ? searchWords.get(word) + 1 : 1);
				}
			}
			bufferReader.close();
			return searchWords;
		} catch(IOException ex) {
			throw new SpellCheckerException("Problem in loading the file", ex);
		}
	}
	
}
