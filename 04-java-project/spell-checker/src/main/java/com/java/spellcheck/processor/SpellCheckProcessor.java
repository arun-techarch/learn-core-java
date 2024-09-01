package com.java.spellcheck.processor;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.exception.SpellCheckerException;

public class SpellCheckProcessor {
	private static SpellCheckProcessor spellCheckProcessor = null;
	private HashMap<String, Integer> dictWords = new HashMap<String, Integer>();
	
	private SpellCheckProcessor(HashMap<String, Integer> dictWords){
		this.dictWords = dictWords;
	}
	
	public static SpellCheckProcessor getInstance(HashMap<String, Integer> dictWords) {
		if(spellCheckProcessor == null) {
			spellCheckProcessor = new SpellCheckProcessor(dictWords);
		}
		return spellCheckProcessor;
	}
	
	public SpellCheckResponse execute(Set<String> words) throws SpellCheckerException {
		try {
			String correctword = "";
			List<String> correctWords = new ArrayList<String>();
			SpellCheckResponse response = new SpellCheckResponse();
			Map<String, String> suggestedWords = new HashMap<String, String>();
			
			for(String word : words) {
				correctword = getCorrectWord(word);
				if(word != correctword) {
					suggestedWords.put(word, correctword);
				} else {
					correctWords.add(word);
				}
			}
			
			response.setCorrectWords(correctWords);
			response.setSuggestedWords(suggestedWords);
			response.setIsCorrectionFound((suggestedWords.size() > 0)?true:false);
			return response;
		} catch(Exception ex) {
			throw new SpellCheckerException(ex.getMessage(), ex);
		}
	}
	
	private final ArrayList<String> getAllSearchWordList(String word) {
		ArrayList<String> wordList = new ArrayList<String>();
		for(int i=0; i < word.length(); ++i) {
			wordList.add(word.substring(0, i) + word.substring(i+1));
		}
		for(int i=0; i < word.length()-1; ++i) {
			wordList.add(word.substring(0, i) + word.substring(i+1, i+2) + word.substring(i, i+1) + word.substring(i+2));
		}
		for(int i=0; i < word.length(); ++i) {
			for(char c='a'; c <= 'z'; ++c) {
				wordList.add(word.substring(0, i) + String.valueOf(c) + word.substring(i+1));
			}
		}
			
		for(int i=0; i <= word.length(); ++i) {
			for(char c='a'; c <= 'z'; ++c) {
				wordList.add(word.substring(0, i) + String.valueOf(c) + word.substring(i));
			}
		}
		return wordList;
	}
	
	public final String getCorrectWord(String word) {
		if(dictWords.containsKey(word)) return word;
		ArrayList<String> allSearchWords = getAllSearchWordList(word);
		HashMap<Integer, String> searchResult = new HashMap<Integer, String>();
		
		for(String searchword: allSearchWords) {
			if(dictWords.containsKey(searchword)) {
				searchResult.put(dictWords.get(searchword), searchword);
			}
		}
		if(searchResult.size() > 0) {
			return searchResult.get(Collections.max(searchResult.keySet()));
		}
		
		for(String searchword: allSearchWords) {
			for(String wd: getAllSearchWordList(searchword)) {
				if(dictWords.containsKey(wd)) {
					searchResult.put(dictWords.get(wd), wd);
				}
			}
		}
		return searchResult.size() > 0 ? searchResult.get(Collections.max(searchResult.keySet())) : word;
	}

}
