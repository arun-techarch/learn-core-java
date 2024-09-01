package com.java.spellcheck.utils;

import java.util.Set;
import java.util.List;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.exception.SpellCheckerException;

public class SpellChecker {
	protected static SpellCheckResponse response;

	public static SpellCheckResponse checkSpell(String... word) throws SpellCheckerException {
		IWordSpellChecker spellChecker = (IWordSpellChecker) SpellCheckerUtil.getSpellChecker(SpellCheckerType.WORDS);
		response = spellChecker.processSpellCheck(word);
		return response;
	}
	
	public static SpellCheckResponse checkSpell(List<String> words) throws SpellCheckerException{
		IListSpellChecker spellChecker = (IListSpellChecker) SpellCheckerUtil.getSpellChecker(SpellCheckerType.LIST);
		response = spellChecker.processSpellCheck(words);
		return response;
	}
	
	public static SpellCheckResponse checkSpell(Set<String> words) throws SpellCheckerException{
		ISetSpellChecker spellChecker = (ISetSpellChecker) SpellCheckerUtil.getSpellChecker(SpellCheckerType.LIST);
		response = spellChecker.processSpellCheck(words);
		return response;
	}
	
	public static SpellCheckResponse checkSpell(String filePath) throws SpellCheckerException{
		IFileSpellChecker spellChecker = (IFileSpellChecker) SpellCheckerUtil.getSpellChecker(SpellCheckerType.FILE);
		response = spellChecker.processSpellCheck(filePath);
		return response;
	}

}
