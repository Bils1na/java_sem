package algorithms.seminar1;


public class Main {
    public static void main(String[] args) {
        int sum = sumNumbers(10);
        System.out.println(sum);
    }

    public static int sumNumbers(int numbers) {
        int sum = 0;
        for (int i = 1; i <= numbers; i += 2) {
            sum += i + i + 1;
        }
        return sum;
    }
    
    // public static int findCombination(int k, int n) {
    //     int count = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {

    //         }
    //     }
    // } 

    public static int fib(int position) {
        if (position == 1) {
            return 1;
        }
        if (position == 2) {
            return 1;
        }

        return fib(position- 1) + fib(position - 2);
    }
}