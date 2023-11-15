package algorithms.lecture1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> simpleNumbers = new ArrayList<>();
        
        simpleNumbers = findSimpleNumbers(100);
        System.out.println(simpleNumbers);
    }

    public static List<Integer> findSimpleNumbers(int max) {
        List<Integer> simpleNumbers = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                }
            }
            if (simple) {
                simpleNumbers.add(i);
            }
        }
        return simpleNumbers;
    }
}
