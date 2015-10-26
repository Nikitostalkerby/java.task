package javase01.task04;

public class Parameter<T> {

	T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	Parameter(T object) {
		this.object = object;
	}
}