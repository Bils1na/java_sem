package seminar3OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
 
    public static void main(String[] args) {
        List<Person> strings = new ArrayList<>();
        strings.add(new Person("Igor", 10));
        strings.add(new Person("Ivan", 20));
        strings.add(new Person("Egor", 25));
        strings.add(new Person("Artem", 30));

        // Из списка получить только тех кто старше 25 лет.
        
        // Stream<Person> stream = strings.stream();
        // Stream<Person> filtered = stream.filter(it -> it.getAge() > 25);
        // filtered.forEach(it -> System.out.println(it));
        List<Person> filtered = strings.stream()
            .filter(it1 -> it1.getAge() > 25)
            .toList();
            // .forEach(it -> System.out.println(it));

        // Всем сотрд. выше 25 поднять зп.

        strings.stream()
            .filter(it -> it.getAge() > 25);
//            .forEach(it -> it.setSalary(it.getSalary() + 50));


        List<String> lans = List.of("Java", "C", "C#", "Kotlin");

        lans.stream()
            .filter(it -> it.length() > 3)
            .map(it -> it.toUpperCase()) //String::toUpperCase;
            // .sorted((a, b) -> a.length() - b.length())
            .sorted(Comparator.comparingInt(String::length).reversed())
            .map(it -> it.substring(1))
            .forEach(System.out::println);
        // filter
        // map
        // forEach
        // limit
        // skip
        // peek
        // ...

    }
}

//class Person {
//    private String name;
//    private int age;
//    private int salary;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int value) {
//        salary += value;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//        "name='" + name + "\'";
//    }
//}

