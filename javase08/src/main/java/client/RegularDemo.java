package client;

import regulars.*;

/**
 * Created by Vaas on 23.11.2015.
 */

/*
На самом деле нужен всего один класс.
И передавать туда строку и регулярку.
Но это слишком просто.
 */

public class RegularDemo {
    public static void main(String[] args) {
        ABCValidator abcValidator = new ABCValidator();
        System.out.println("ABCValidator:   " + abcValidator.validate("abcdefghijklmnopqrstuv18340"));

        GUIDValidator guidValidator = new GUIDValidator();
        System.out.println("GUIDValidator:  " + guidValidator.validate("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));

        MACValidator macValidator = new MACValidator();
        System.out.println("MACValidator:   " + macValidator.validate("a7:dC:cA:56:76:54"));

        URLValidator urlValidator = new URLValidator();
        System.out.println("URLValidator:   " + urlValidator.validate("http://example.com"));

        ColorValidator colorValidator = new ColorValidator();
        System.out.println("ColorValidator: " + colorValidator.validate("#FFFFFF"));

        DateValidator dateValidator = new DateValidator();
        System.out.println("DateValidator:  " + dateValidator.validate("30/04/2003"));
    }
}
