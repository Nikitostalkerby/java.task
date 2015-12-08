package com.github.union.one.task02.object;

public class WithComparable implements Comparable<WithComparable> {

    private int i;

    public WithComparable(int i) {
        super();
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(WithComparable o) {
        return (i < o.getI()) ? -1 : ((i == o.getI()) ? 0 : 1);
    }
}