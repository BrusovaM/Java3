package ru.geekbrains.java3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> arr;
    private double weight;

    public Box(){
        arr = new ArrayList<>();
    }

    //d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и
    // вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public double getWeight(){
        return weight;
    }

    public void addFruit(T fruit){
        arr.add(fruit);
        weight += fruit.getWeight();
    }

    //e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
    // которую подадут в compare в качестве параметра, true - если их веса равны,
    // false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    public boolean compare(Box another){
        return this.getWeight()==another.getWeight();
    }

  // private
    //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
    // (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
    //  соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
    public void addFromBox(Box<T> b){
        arr.addAll(b.arr);
        this.weight += b.getWeight();
        b.arr.clear();
        b.weight = 0;
    }

    @Override
    public String toString(){
       String s = "";
       for (int i=0; i < arr.size(); i++){
           s +=  i + " = " + arr.get(i).toString() + "\n";
       }

       return s;
  }


}
