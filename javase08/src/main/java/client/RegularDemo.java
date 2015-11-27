package client;

import impl.Validate;
import regulars.*;

/**
 * Created by Vaas on 23.11.2015.
 */

public class RegularDemo {
    public static void main(String[] args) {
        Validate abcValidator = new ABCValidator();
        System.out.println("ABCValidator:   " + abcValidator.validate("abcdefghijklmnopqrstuv18340"));

        Validate guidValidator = new GUIDValidator();
        System.out.println("GUIDValidator:  " + guidValidator.validate("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));

        Validate macValidator = new MACValidator();
        System.out.println("MACValidator:   " + macValidator.validate("a7:dC:cA:56:76:54"));

        Validate urlValidator = new URLValidator();
        System.out.println("URLValidator:   " + urlValidator.validate("http://example.com"));

        Validate colorValidator = new ColorValidator();
        System.out.println("ColorValidator: " + colorValidator.validate("#FFFFFF"));

        Validate dateValidator = new DateValidator();
        System.out.println("DateValidator:  " + dateValidator.validate("30/04/2003"));
    }
}
