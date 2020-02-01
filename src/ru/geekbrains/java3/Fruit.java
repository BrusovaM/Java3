package ru.geekbrains.java3;

import javax.print.Doc;

public abstract class Fruit {
    private Double weight;

    public Fruit(Double w){
        weight = w;
    }
    public Double getWeight() {
        return weight;
    }

    @Override
    public abstract String toString();


}
