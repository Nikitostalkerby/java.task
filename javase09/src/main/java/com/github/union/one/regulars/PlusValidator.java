package com.github.union.one.regulars;

import com.github.union.one.impl.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 27.11.2015.
 */
public class PlusValidator implements Validate {
    private Pattern pattern;

    private static final String ABC_PATTERN = "([^\\s]*\\d([ ]\\+)[^\\s]*)";
    //([\d]+[ ]*[+])

    public PlusValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}