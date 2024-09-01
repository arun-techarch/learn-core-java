package com.java.spellcheck.utils;

import com.java.spellcheck.exception.SpellCheckerException;
import com.java.spellcheck.response.SpellCheckResponse;

public interface IWordSpellChecker extends ISpellChecker {
    SpellCheckResponse processSpellCheck(String... word) throws SpellCheckerException;
}
