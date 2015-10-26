package javase01.task04;

public class Discriminant {

	static Parameter<?> find(Parameter<?> a, Parameter<?> b, Parameter<?> c) {
		Parameter<?> d = null;

		if (a.getObject().equals("a")) {
			d = new Parameter<String>("a");
		} else {
			d = new Parameter<Integer>((Integer) a.getObject());
		}

		if (b.getObject().equals("b")) {
			if (a.getObject().equals("a") && c.getObject().equals("c")) {
				d = new Parameter<String>("b^2 - 4*a*c");
			} else if (a.getObject().equals("a")) {
				d = new Parameter<String>("b^2 - 4*a*" + c.getObject());
			} else if (c.getObject().equals("c")) {
				d = new Parameter<String>("b^2 - 4*c*" + a.getObject());
			}
		} else {
			d = new Parameter<Integer>((Integer) b.getObject() * (Integer) b.getObject() - 4 * (Integer) a.getObject() * (Integer) c.getObject());
		}

		return d;
	}
}