package ru.geekbrains.java3;

public class Apple extends Fruit {
    private String color;

    public Apple(Double w, String c){
        super(w);
        color = c;
    }

    @Override
    public String toString() {
        return "[weight = " + this.getWeight() + ", color = " + this.color + "]";
    }
}
