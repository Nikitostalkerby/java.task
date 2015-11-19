package task04.logic;

public class Parameter<T> {

    T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Parameter(T object) {
        this.object = object;
    }
}