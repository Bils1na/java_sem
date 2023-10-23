package seminar6;

//1. Создайте HashSet, заполните его следующими числавми: {1, 2, 3, 2, 4, 5, 6, 3}.
//Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числавми: {1, 2, 3, 2, 4, 5, 6, 3}.
//Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числавми: {1, 2, 3, 2, 4, 5, 6, 3}.
//Распечатайте содержимое данного множества.

import java.util.*;

public class FirstTask {
    HashSet<Integer> hSet;
    LinkedHashSet<Integer> lSet;
    TreeSet<Integer> tSet;

    public FirstTask() {
        hSet = new HashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
        lSet = new LinkedHashSet<>(List.of(3, 6, 5, 4, 2, 3, 2, 1));
        tSet = new TreeSet<>(List.of(3, 6, 5, 4, 2, 3, 2, 1));
    }

    public void printSets() {
        System.out.println(hSet);
        System.out.println(lSet);
        System.out.println(tSet);
    }
}
