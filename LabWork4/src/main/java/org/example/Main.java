package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Задание № 1---------------");
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);
        System.out.println("---------------Задание № 2---------------");
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
        System.out.println("---------------Задание № 3---------------");
        Box<Orange> or = new Box<>(new Orange(), new Orange());
        Box<Orange> or1 = new Box<>(new Orange());
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>(new Apple());
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("Box 1 равен box 3: "+or.compare(ap));
        System.out.println("Box 2 равен box 4: "+or1.compare(ap1));
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        or.output();
        or.addFruit(new Orange(),new Orange());
    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Начальный массив: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Итоговый масив: "+Arrays.toString(arr)+"\n");
    }
    public static <T> void asList(T[]arr){
        System.out.println("Начальный массив: "+ Arrays.toString(arr));
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Итоговый массив "+alt+"\n");
    }

}