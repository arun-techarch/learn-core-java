package com.java.spellcheck.utils;

public enum SpellCheckerType {
	WORDS, LIST, FILE, SET;
	
	public String toString(){
		switch(this)
		{
			case WORDS:
				return "word";
			case LIST:
				return "list";
			case FILE:
				return "file";
			case SET:
				return "set";
			default:
				return "invalid spell check type";
		}
	}
}
