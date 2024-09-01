package com.java.spellcheck.utils;

import java.util.Set;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.exception.SpellCheckerException;

public interface ISetSpellChecker extends ISpellChecker {
    SpellCheckResponse processSpellCheck(Set<String> list) throws SpellCheckerException;
}
