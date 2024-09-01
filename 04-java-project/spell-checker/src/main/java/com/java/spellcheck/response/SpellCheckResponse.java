package com.java.spellcheck.response;

import java.util.Map;
import java.util.List;

public class SpellCheckResponse {
	private List<String> correctWords;
	private Map<String, String> suggestedWords;
	private Boolean isCorrectionFound = false;
	
	public List<String> getCorrectWords() {
		return correctWords;
	}
	
	public void setCorrectWords(List<String> correctWords) {
		this.correctWords = correctWords;
	}
	
	public Map<String, String> getSuggestedWords() {
		return suggestedWords;
	}
	
	public void setSuggestedWords(Map<String, String> suggestedWords) {
		this.suggestedWords = suggestedWords;
	}

	public Boolean getIsCorrectionFound() {
		return isCorrectionFound;
	}

	public void setIsCorrectionFound(Boolean isCorrectionFound) {
		this.isCorrectionFound = isCorrectionFound;
	}

}
