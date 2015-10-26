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
			d = new Parameter<String>("b^2");
		} else {
			d = new Parameter<Integer>((Integer) b.getObject());
		}

		//System.out.println("D: " + d.getObject());
		return d;
	}
}