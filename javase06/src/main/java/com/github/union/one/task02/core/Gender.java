package com.github.union.one.task02.core;

/**
 * Created by Vaas on 16.11.2015.
 */
public enum Gender {
    Male, Female;

    public static Gender findGender(String string) {
        for (Gender gender : Gender.values()) {
            if (string.equals(gender.name())) {
                return gender;
            }
        }
        return null;
    }
}
