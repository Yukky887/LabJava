package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box() {
        this.box = new ArrayList<>();
    }
    public Box(T...fruit){
        this.box = new ArrayList<>(Arrays.asList(fruit));
    }
    public void addFruit(T fruit){
        this.box.add(fruit);
    }
    public void addFruit(T...fruit){
        this.box.addAll(Arrays.asList(fruit));
    }

    public void output(){
        for (T t : box) {
            System.out.println(t);
        }
    }
    public float getWeight(){
        float weight = 0.0f;
        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }
    public boolean compare(Box <?>anotherBox) {
        return (getWeight() - anotherBox.getWeight()) < 0.01;
    }
    public void pourTo(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }
}