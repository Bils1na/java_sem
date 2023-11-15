package algorithms.lecture1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // List<Integer> simpleNumbers = new ArrayList<>();
        
        // simpleNumbers = findSimpleNumbers(100);
        // System.out.println(simpleNumbers);
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(10, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());
        
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

    public static List<Integer> findAvailableDivisors(int max) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i < max; i++) {
            if (max % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static double FindDiceSum(int sum) {
        int count = 0;
        int successResult = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (i + j + k == sum) {
                        successResult++;
                    }
                    count++;
                }
            }
        }
        return ((double) successResult) / ((double) count);
    }

    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fib(position - 1, counter) + fib(position - 2, counter);
    }
}
