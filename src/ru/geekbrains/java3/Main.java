package ru.geekbrains.java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //задание 1
        swap(arr,2,4);
        System.out.println(Arrays.asList(arr).toString());

        //задание 2
        System.out.println(convertArrayToList(arr).toString());


        //задание 3
        Apple a1,a2,a3,a4,a5;
        a1 = new Apple(1.0,"yellow");
        a2 = new Apple(1.5,"red");
        a3 = new Apple(2.0,"green");
        a4 = new Apple(2.0,"white");
        a5 = new Apple(2.0,"");

        Orange o1,o2,o3;
        o1 = new Orange(1.2,"Turkey");
        o2 = new Orange(0.7,"Russia");
        o3 = new Orange(2.1,"Spain");


        Box<Apple> boxApple1 = new Box<>();
       // boxApple1.addFruit(o1); //не дает добавить апельсин
        boxApple1.addFruit(a1);
        boxApple1.addFruit(a2);
        boxApple1.addFruit(a3);


        Box<Apple> boxApple2 = new Box<>();
        boxApple2.addFruit(a4);
        boxApple2.addFruit(a5);


        Box<Orange> boxOrange = new Box<>();
        boxOrange.addFruit(o1);
        boxOrange.addFruit(o2);
        boxOrange.addFruit(o3);


        System.out.println("boxApple1:\n" + boxApple1);
        System.out.println("boxApple1 weight = " + boxApple1.getWeight());
        System.out.println("boxApple2:\n" + boxApple2);
        System.out.println("boxApple2 weight = " + boxApple2.getWeight());
        System.out.println("boxOrange:\n" + boxOrange);
        System.out.println("boxOrange weight = " + boxOrange.getWeight());

        System.out.println(boxOrange.compare(boxApple1)); //false
        System.out.println(boxOrange.compare(boxApple2)); //true

        //boxApple1.addFromBox(boxOrange); //не дает пересыпать апельсины в яблоки
        boxApple1.addFromBox(boxApple2);

        System.out.println("boxApple1:\n" + boxApple1);
        System.out.println("boxApple1 weight = " + boxApple1.getWeight());
        System.out.println("boxApple2:\n" + boxApple2);
        System.out.println("boxApple2 weight = " + boxApple2.getWeight());




    }

    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static void swap(Object[] arr, int i, int j){
        Object temp;
        if(arr == null) {
            return;
        }

        if(i < 0 || i >= arr.length || j < 0 || j >= arr.length){
            throw new IllegalArgumentException("Неверные индексы массива");
        }

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public static ArrayList<Object> convertArrayToList(Object[] arr){
        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list, arr); //не понимаю, есть же уже метод, зачем его писать
        return list;
    }
}
