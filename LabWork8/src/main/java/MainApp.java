import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {
        //1е задание
        List<String> listWorld = new ArrayList<>(Arrays.asList("ау","трансформатор","резистер","ау","трансформатор","корыто","корыто"));
        System.out.println(listWorld);


        System.out.println(listWorld.stream()

                        .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey());

        //2е задание
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Егорик", 34, 90000));
        persons.add(new Person("Санечка", 45, 20000));
        persons.add(new Person("Димооон", 18, 25000));
        persons.add(new Person("Кеша", 25, 12000));
        persons.add(new Person("Илларион", 45, 15000));

        Double average = persons.stream().collect(Collectors.averagingInt(Person::getSalary));
        System.out.printf("Средняя зарплата сотрудников: %s \n", average);

        //3е задание
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите n первых сотрудников(не более 5)");
        int N = keyboard.nextInt();
        System.out.println(persons.stream().sorted(((o1, o2) -> o2.age - o1.age))
                .map((Function<Person, String>) person->person.name)
                .limit(N)
                .collect(Collectors.joining(" " ,  N+" самых старших сотрудников в компании: " ,  "." )));

    }

}
