package com.github.union.one.javase09.regulars;

import impl.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vaas on 23.11.2015.
 */
public class ABCValidator implements Validate {

    private Pattern pattern;

    private static final String ABC_PATTERN = "abcdefghijklmnopqrstuv18340";

    public ABCValidator() {
        pattern = Pattern.compile(ABC_PATTERN);
    }

    @Override
    public boolean validate(final String line) {
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}