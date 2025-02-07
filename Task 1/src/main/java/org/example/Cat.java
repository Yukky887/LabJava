package org.example;

public class Cat extends Animal {
    private static int count;

    public Cat(String name, String voice, String color, int age, int run, int swim) {
        super(name, voice, color, age, run, swim);
        count++;
    }
    public static int getCount(){
        return count;
    }
}
