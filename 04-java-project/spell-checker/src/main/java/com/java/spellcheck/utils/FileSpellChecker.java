package com.java.spellcheck.utils;

import java.util.Set;
import java.util.HashMap;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.processor.SpellCheckProcessor;
import com.java.spellcheck.exception.SpellCheckerException;

public class FileSpellChecker implements IFileSpellChecker {
	private HashMap<String, Integer> searchWords = new HashMap<String, Integer>();
	private SpellCheckProcessor spellCheckProcessor = null;
	
	public FileSpellChecker(SpellCheckProcessor spellCheckProcessor) {
		this.spellCheckProcessor = spellCheckProcessor;
	}
	
	@Override
	public SpellCheckResponse processSpellCheck(String filePath) throws SpellCheckerException {
		searchWords = SpellCheckerUtil.getSearchWordList(filePath);
		Set<String> words = searchWords.keySet();
		return spellCheckProcessor.execute(words);
	}
}
