package com.java.spellcheck.utils;

import com.java.spellcheck.exception.SpellCheckerException;
import com.java.spellcheck.response.SpellCheckResponse;

public interface IFileSpellChecker extends ISpellChecker {
    SpellCheckResponse processSpellCheck(String filePath) throws SpellCheckerException;
}
