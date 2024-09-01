package com.java.spellcheck;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import com.java.spellcheck.utils.SpellChecker;
import com.java.spellcheck.utils.SpellCheckerType;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.exception.SpellCheckerException;

public class SpellCheckerMain {

    public static void main( String[] args ) {
        try {
            //File based search #Approach1
            SpellCheckResponse response = SpellChecker.checkSpell("src/main/java/com/java/spellcheck/input/check-input.txt");
            display(response, SpellCheckerType.FILE);

            //Array based search #Approach2
            response = SpellChecker.checkSpell("know", "bind", "ball");
            display(response, SpellCheckerType.WORDS);

            //List based search #Approach3
            List<String> listWords = new ArrayList<String>();
            listWords.add("kniw");
            listWords.add("trust");
            response = SpellChecker.checkSpell(listWords);
            display(response, SpellCheckerType.LIST);

            //Set based search #Approach3
            Set<String> setWords = new HashSet<String>();
            setWords.add("blow");
            setWords.add("must");
            setWords.add("blenk");
            setWords.add("trust");
            response = SpellChecker.checkSpell(setWords);
            display(response, SpellCheckerType.SET);
        } catch(SpellCheckerException ex) {
            System.out.println("Error Occured");
            ex.printStackTrace();
        }
    }

    public static void display(SpellCheckResponse response, SpellCheckerType searchType) {
        if(searchType == SpellCheckerType.FILE) {
            System.out.println("*********************************************************************");
            System.out.println("                     FILE BASED SEARCH              ");
        } else if(searchType == SpellCheckerType.WORDS) {
            System.out.println("                     WORDS BASED SEARCH              ");
        } else if(searchType == SpellCheckerType.LIST) {
            System.out.println("                     LIST BASED SEARCH              ");
        } else if(searchType == SpellCheckerType.SET) {
            System.out.println("                     SET BASED SEARCH              ");
        }
        System.out.println("*********************************************************************");
        if(response != null) {
            System.out.println("Correction Found: "+response.getIsCorrectionFound());
            if(response.getIsCorrectionFound()) {
                System.out.println("Status Message: Some of the words not found in dictionary but, some suggestion's are found for you");
            } else {
                System.out.println("Status Message: The given words are correct so, no corrections are needed");
            }

            if(response.getCorrectWords().size() > 0) {
                System.out.println("Correct Words: \n\t"+String.join(", ", response.getCorrectWords()));
            }
            if(response.getSuggestedWords().size() > 0) {
                System.out.println("Suggested Words: ");
                Set<String> words = response.getSuggestedWords().keySet();
                for(String word:words){
                    System.out.println("\t"+ word+"   --   "+response.getSuggestedWords().get(word));
                }
            }
        } else {
            System.out.println("Response is not found");
        }

        System.out.println("*********************************************************************");
    }
}
