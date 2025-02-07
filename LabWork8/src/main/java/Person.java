import java.util.stream.*;
//import java.util.stream.IntStream;

public class Person {
    public String name;
    public int age;
    public int salary;
    int N;

    Person(String name, int age, int salary) {
        this.name =name;
        this.age = age;
        this.salary = salary;
    }

    public static IntStream stream() {
        return stream();
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }

//    public void printInfo(){
////        for (int i = 0; i < persons.length; i++) {
////            if (persons[i].getAge() > 40) {
////                persons[i].printInfo();
////            }
////        }
//        System.out.println(N + " самых старших сотрудников зовут: " + name);
//    }
}
