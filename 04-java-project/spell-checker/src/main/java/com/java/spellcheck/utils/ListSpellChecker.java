package com.java.spellcheck.utils;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.processor.SpellCheckProcessor;
import com.java.spellcheck.exception.SpellCheckerException;

public class ListSpellChecker implements IListSpellChecker, ISetSpellChecker {
	private SpellCheckProcessor spellCheckProcessor;
	
	public ListSpellChecker(SpellCheckProcessor spellCheckerProcessor) {
		this.spellCheckProcessor = spellCheckerProcessor;
	}

	@Override
	public SpellCheckResponse processSpellCheck(List<String> list) throws SpellCheckerException {
		try{
			Set<String> words = new HashSet<String>();
			if(list != null && list.size() > 0){
				for(int i=0;i<list.size();i++){
					words.add(list.get(i));
				}
			}
			return spellCheckProcessor.execute(words);
		}catch(Exception ex){
			throw new SpellCheckerException(ex.getMessage(), ex);
		}
	}
	
	@Override
	public SpellCheckResponse processSpellCheck(Set<String> set) throws SpellCheckerException {
		try{
			return spellCheckProcessor.execute(set);
		}catch(Exception ex){
			throw new SpellCheckerException(ex.getMessage(), ex);
		}
	}

}
