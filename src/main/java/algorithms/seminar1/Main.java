package algorithms.seminar1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // int sum = sumNumbers(10);
        // System.out.println(sum);
        long start = System.currentTimeMillis();
        // System.out.println(fib(40));
        int fib = fib(40);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        int fibFor = fibFor(40);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static int sumNumbers(int numbers) {
        int sum = 0;
        for (int i = 1; i <= numbers; i += 2) {
            sum += i + i + 1;
        }
        return sum;
    }
    
    public static int findCombination(int k, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    } 

    public static int fib(int position) {
        if (position == 1) {
            return 1;
        }
        if (position == 2) {
            return 1;
        }

        return fib(position- 1) + fib(position - 2);
    }

    public static int fibFor(int position) {
        int firstDigit = 1;
        int secondDigit = 1;
        int thirdDigit = firstDigit + secondDigit;

        if (position == 0) return 0;
        if (position == 1 || position == 2) return 1;
        if (position == 3) return thirdDigit;

        for (int i = 4; i <= position; i++) {
            firstDigit = secondDigit;
            secondDigit = thirdDigit;
            thirdDigit = firstDigit + secondDigit;
        }
        return thirdDigit;
    }

    public static void findSimpleNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) simple = false;
            }
            if (simple) {
                System.out.println(i);
            }
        }
    }   

    public static boolean isPrime(int num) {
        return IntStream.rangeClosed(2, num / 2).anyMatch(n -> num % n != 0);
    }
}