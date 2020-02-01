package ru.geekbrains.java3;

public class Orange extends Fruit {
    private String country;

    public Orange(Double w, String c){
        super(w);
        country = c;
    }

    @Override
    public String toString() {
        return "[weight = " + this.getWeight() + ", color = " + this.country + "]";
    }
}
