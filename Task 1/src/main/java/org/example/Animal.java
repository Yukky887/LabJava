package org.example;

public class Animal {
    private String name;
    private String voice;
    private String color;
    private int age;
    private int run;
    private int swim;

    private static int count;

    public Animal(String name, String voice, String color, int age, int run, int swim){
        this.name = name;
        this.age = age;
        this.color = color;
        this.run = run;
        this.swim = swim;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance){
        if(distance<run){
            System.out.println(this.name + " успешно пробежал " + distance);
        }
        else {
            System.out.println(this.name + " не пробежал " + distance);
        }
    }

    public void swim(int distance){
        if(distance<run){
            System.out.println(this.name + " успешно проплыл " + distance);
        }
        else {
            System.out.println(this.name + " не пробежал " + distance);
        }
    }

}
