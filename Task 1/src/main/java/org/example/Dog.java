package org.example;

public class Dog extends Animal{
    private static int count;

    public Dog(String name, String voice, String color, int age, int run, int swim) {
        super(name, voice, color, age, run, swim);
        count++;
    }
    public static int getCount(){
        return count;
    }

}
