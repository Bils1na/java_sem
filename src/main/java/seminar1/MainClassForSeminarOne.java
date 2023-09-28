package seminar1;

import java.util.Scanner;

public class MainClassForSeminarOne {
    public static void main(String[] args) {
//        temp();
//        task0();
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Good day, %s!", scanner.nextLine());
        int[] arr = new int[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1};
        task2(arr);
    }

    private static void task0() {
        System.out.println("Hello");
    }

    private static void temp() {
        //          System.out.println(); // sout
//          for (int i = 0; i < ; i++) {  // fori
//        for (String arg : args) { // iter
//        ctrl+alt+T -- вынос блока в код
//        ctrl+alt+L -- автоформатирование
       /* if (false && true) {
        }*/
    }

    //        Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1],
//    вывести макс количество подряд идущих 1.
    public static void task2(int[] numbers) {
        int count = 0, max = 0;
        for (int item : numbers) {
            count += item == 1 ? 1 : -count;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}