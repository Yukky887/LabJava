package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик","Гав-гав", "Белый",5,500,300);
        Cat[] cats = new Cat[]{new Cat("Барсик","Мяу-мяу","Черный",4,350,400),
        new Cat("Том","Мур-мур","Серый",6,450,350)};
        Tiger tiger = new Tiger("Амур","Рррр","Рыжsq",6,600,450);

        System.out.println("Количество котов = " + Cat.getCount());
        System.out.println("Количество собак = " + Dog.getCount());
        System.out.println("Количество тигров = " + Tiger.getCount());

        System.out.println("Общее количество животных = " + Animal.getCount());

        Animal[] animals = new Animal[Animal.getCount()];
        animals[0] = dog;
        animals[1] = cats[0];
        animals[2] = cats[1];
        animals[3] = tiger;

        System.out.println("Соревнование бег");
        for(int i = 0; i < animals.length; i++){
            animals[i].run(400);
        }

        System.out.println("Соревнование плаванье");
        for(Animal a : animals){
            a.swim(400);
        }
    }
}