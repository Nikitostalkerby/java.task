package com.github.union.one.task04.base;

/**
 * Created by Vaas on 17.11.2015.
 */
public class Buy extends Product {
    private int number;
    private int commonCost;
    private int commonWeight;

    public Buy(String name, int cost, int weight, int number) {
        super(name, cost, weight);
        this.number = number;
        this.commonCost = this.number * super.getCost();
        this.commonWeight = this.number * super.getWeight();
    }

    public Buy() {
        super();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCommonCost() {
        return commonCost;
    }

    public void setCommonCost(int commonCost) {
        this.commonCost = commonCost;
    }

    public int getCommonWeight() {
        return commonWeight;
    }

    public void setCommonWeight(int commonWeight) {
        this.commonWeight = commonWeight;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "number=" + number +
                ", commonCost=" + commonCost +
                ", commonWeight=" + commonWeight +
                '}';
    }
}
