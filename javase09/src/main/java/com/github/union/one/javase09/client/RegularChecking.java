package com.github.union.one.javase09.client;

import impl.Validate;
import regulars.EmailValidator;
import regulars.IPValidator;
import regulars.PassValidator;
import regulars.SixDigitValidator;
import regulars.PriceValidator;
import regulars.PlusValidator;
import regulars.BracketValidator;

/**
 * Created by Vaas on 27.11.2015.
 */
public class RegularChecking {
    public static void main(String[] args) {
        Validate emailValidator = new EmailValidator();
        System.out.println("EmailValidator:   \t" + emailValidator.validate("hax2033@gmail.com"));

        Validate ipValidator = new IPValidator();
        System.out.println("IPValidator:      \t" + ipValidator.validate("192.168.1.100"));

        Validate passValidator = new PassValidator();
        System.out.println("PassValidator:    \t" + passValidator.validate("SupperPas1"));

        Validate sixDigitValidator = new SixDigitValidator();
        System.out.println("SixDigitValidator:\t" + sixDigitValidator.validate("123456"));

        Validate priceValidator = new PriceValidator();
        System.out.println("PriceValidator:   \t" + priceValidator.validate("23.78 USD"));

        Validate plusValidator = new PlusValidator();
        System.out.println("PlusValidator:    \t" + plusValidator.validate("(3 + 5) – 9 × 4"));

        Validate bracketValidator = new BracketValidator();
        System.out.println("BracketValidator: \t" + bracketValidator.validate("(3 + 5) – 9 × 4"));
    }
}