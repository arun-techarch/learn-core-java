package com.java.spellcheck.utils;

import java.util.Set;
import java.util.HashSet;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.processor.SpellCheckProcessor;
import com.java.spellcheck.exception.SpellCheckerException;

public class WordSpellChecker implements IWordSpellChecker {
	private SpellCheckProcessor spellCheckProcessor;
	
	public WordSpellChecker(SpellCheckProcessor spellCheckProcessor) {
		this.spellCheckProcessor = spellCheckProcessor;
	}

	@Override
	public SpellCheckResponse processSpellCheck(String... word) throws SpellCheckerException {
		return executeSpellCheck(word);
	}
	
	private SpellCheckResponse executeSpellCheck(String... words) throws SpellCheckerException {
		try{
			Set<String> list = new HashSet<String>();
			if(words != null && words.length > 0) {
				for(String word:words) {
					list.add(word);
				}
			}
			return spellCheckProcessor.execute(list);
		}catch(Exception ex){
			throw new SpellCheckerException(ex.getMessage(), ex);
		}
	}
	
}
