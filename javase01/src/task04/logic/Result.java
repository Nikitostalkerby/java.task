package task04.logic;

public class Result {

    public static String find(Object d, Parameter<?> a, Parameter<?> b) {

        String str = d.toString();

        Parameter<?> x1 = null;
        Parameter<?> x2 = null;

        if (b.getObject().equals("b")) {
            if (a.getObject().equals("a") && d.equals(str)) {
                x1 = new Parameter<String>("(-b (+) sqrt(" + str + "))/2a");
                x2 = new Parameter<String>("(-b (-) sqrt(" + str + "))/2a");
            } else if (a.getObject().equals("a")) {
                x1 = new Parameter<String>("(-b (+) " + Math.sqrt((double) d) + ")/2a");
                x2 = new Parameter<String>("(-b (-) " + Math.sqrt((double) d) + ")/2a");
            } else if (d.equals(str)) {
                x1 = new Parameter<String>("(-b (+) sqrt(" + str + "))/" + 2 * (Integer) a.getObject());
                x2 = new Parameter<String>("(-b (-) sqrt(" + str + "))/" + 2 * (Integer) a.getObject());
            }
        } else {
            if (a.getObject().equals("a")) {
                x1 = new Parameter<String>("(" + (-1) * (Integer) b.getObject() + " (+) " + str + ")/2a");
                x2 = new Parameter<String>("(" + (-1) * (Integer) b.getObject() + " (-) " + str + ")/2a");
            } else if (d.equals(str)) {
                x1 = new Parameter<String>("(" + (-1) * (Integer) b.getObject() + " (+) sqrt(" + str + "))/"
                        + 2 * (Integer) a.getObject());
                x2 = new Parameter<String>("(" + (-1) * (Integer) b.getObject() + " (-) sqrt(" + str + "))/"
                        + 2 * (Integer) a.getObject());
            } else if (a.getObject().equals("a") && d.equals(str)) {
                x1 = new Parameter<String>("(" + (-1) * (Integer) b.getObject() + " (+) sqrt(" + str + "))/2a");
                x2 = new Parameter<String>("(" + (-1) * (Integer) b.getObject() + " (-) sqrt(" + str + "))/2a");
            } else {
                x1 = new Parameter<Double>((double) ((-1) * (Integer) b.getObject()
                        + (Math.sqrt((double) d)) / 2 * (Integer) a.getObject()));
                x1 = new Parameter<Double>((double) ((-1) * (Integer) b.getObject()
                        - (Math.sqrt((double) d)) / 2 * (Integer) a.getObject()));
            }
        }

        return "X1: " + x1.getObject() + "\nX2: " + x2.getObject();
    }
}