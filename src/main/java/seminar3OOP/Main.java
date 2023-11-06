package seminar3OOP;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Comparator, Comparable

        // Iterator, Iterable

        // Comparator<String> stringComparator = new Comparator<String>() {
        //     @Override
        //     public int compare(String a, String b) {
        //         return b.length() - a.length();
        //     }
        // };

        
        Comparator<String> comparatorString = (a, b) -> {
            return b.length() - a.length();
        };

        // Comparator<String> comparatorString2 = Comparator.comparing(new Function<String, Integer>() {
        //     @Override
        //     public Integer apply(String s) {
        //         return s.length();
        //     }
        // });

        Function<String, Integer> stringIntegerFunction = (s) -> s.length(); //String::length;
        Comparator<String> comparatorString2 = Comparator.comparing(stringIntegerFunction);

        StringLengthComparator stringLengthComparator = new StringLengthComparator();
        Set<String> strings = new TreeSet<>(new StringLengthComparator());
        strings.add("Java");
        strings.add("C");
        strings.add("C++");
        strings.add("Python");
        strings.add("Kotlin");
        strings.add("C#");

        System.out.println(strings);


        Set<Person> persons = new TreeSet<>();
        persons.add(new Person(10));
        persons.add(new Person(11));
        persons.add(new Person(12));
        persons.add(new Person(13));
        persons.add(new Person(14));

    }
}


class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return b.length() - a.length();
    }
    
}


class Person implements Comparable<Person> {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person(String igor, int i) {
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Person person) {
        return age - person.getAge();
        // if (age < person.age) {
        //     return -1;
        // } else if (age > person.age) {
        //     return 1;
        // }
        // return 0;
    }

    @Override
    public String toString() {
        return "[" + age + "]";
    }
}

