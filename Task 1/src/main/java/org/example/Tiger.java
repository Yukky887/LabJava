package org.example;

public class Tiger extends Animal {
    public static int count;

    public Tiger(String name, String voice, String color, int age, int run, int swim) {
        super(name, voice, color, age, run, swim);
        count++;
    }
    public static int getCount(){
        return count;
    }
}
