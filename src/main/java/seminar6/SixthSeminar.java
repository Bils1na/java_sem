package seminar6;

import java.util.*;
import java.util.stream.Collectors;

public class SixthSeminar {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList(); // raw type
//        ArrayList<Integer> integers = new ArrayList<>(); // param type
//        ArrayList<Integer> even = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        integers.add(5);
//        integers.add(6);
////        for (Integer integer : integers) {
////            if (integer % 2 == 0) {
////                even.add(integer);
////            }
////        }
//
//        List<Integer> collect = integers
//                .stream()
//                .filter(number -> number % 2 == 0)
//                .map(number -> number * 2)
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

//        ArrayList<Integer> copy = new ArrayList<>(integers);
//        HashSet<Integer> set = new HashSet<>(integers);
//        System.out.println(set);

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> treeSet = new TreeSet<>();
//        Set<Integer> linkedSet = new LinkedHashSet<>();


//        FirstTask firstTask = new FirstTask();
//        firstTask.printSets();

//        SecondTask secondTask = new SecondTask();
//        secondTask.persentUniq();

        Cat maleCat = new Cat(10, "Black", "Female");
        Cat femaleCat = new Cat(10, "Black", "Female");
//        int age = cat.getAge();
//        String color = cat.getColor();
//        System.out.println(age);
//        System.out.println(color);
        HashSet<Cat> cats = new HashSet<>();
        cats.add(maleCat);
        cats.add(femaleCat);
        System.out.println(cats);
    }
}
