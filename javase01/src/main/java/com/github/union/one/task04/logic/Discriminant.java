package com.github.union.one.task04.logic;

public class Discriminant {

    public static Parameter<?> find(Parameter<?> a, Parameter<?> b, Parameter<?> c) {

        Parameter<?> d = null;

        if (b.getObject().equals("b")) {
            if (a.getObject().equals("a") && c.getObject().equals("c")) {
                d = new Parameter<String>("b^2 - 4*a*c");
            } else if (a.getObject().equals("a")) {
                d = new Parameter<String>("b^2 - 4*a*" + c.getObject());
            } else if (c.getObject().equals("c")) {
                d = new Parameter<String>("b^2 - 4*c*" + a.getObject());
            }
        } else {
            if (a.getObject().equals("a")) {
                d = new Parameter<String>(
                        (Integer) b.getObject() * (Integer) b.getObject() + " - 4*a*" + c.getObject());
            } else if (c.getObject().equals("c")) {
                d = new Parameter<String>(
                        (Integer) b.getObject() * (Integer) b.getObject() + " - 4*c*" + a.getObject());
            } else if (a.getObject().equals("a") && c.getObject().equals("c")) {
                d = new Parameter<String>((Integer) b.getObject() * (Integer) b.getObject() + " - 4*c*a");
            } else {
                d = new Parameter<Double>((double) ((Integer) b.getObject() * (Integer) b.getObject()
                        - 4 * (Integer) a.getObject() * (Integer) c.getObject()));
            }
        }

        return d;
    }
}