package seminar3;

//Заполнить список десятью случайными числами.
//Отсортировать спосик методом sort() и вывести его на экран

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ThirdTask {
    private ArrayList<Integer> randomList;

    public ThirdTask() {
        randomList = new ArrayList<>();
    }

    private void fillRandomList() {
        for (int i = 0; i < 10; i++) {
//            double random = Math.random();
            int nextInt = new Random().nextInt(10);
            randomList.add(nextInt);
        }
    }

    public void printSortedList() {
        fillRandomList();
        System.out.println(randomList);
        Collections.sort(randomList);
        System.out.println(randomList);
        randomList.add(1);
        randomList.add(2);
        randomList.add(8);
        randomList.add(4);
        randomList.add(5);
        System.out.println(randomList);
    }
}
