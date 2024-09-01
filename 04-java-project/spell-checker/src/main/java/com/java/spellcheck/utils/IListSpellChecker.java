package com.java.spellcheck.utils;

import java.util.List;
import com.java.spellcheck.response.SpellCheckResponse;
import com.java.spellcheck.exception.SpellCheckerException;

public interface IListSpellChecker extends ISpellChecker {
    SpellCheckResponse processSpellCheck(List<String> list) throws SpellCheckerException;
}
