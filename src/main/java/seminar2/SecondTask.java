package seminar2;

//Напишите метод, который сжимает строку.
//Пример: вход aaaaabbbcddd выход: abcd

import java.util.Scanner;

public class SecondTask {
    String input;
    boolean repeated;

    public SecondTask() {
        Scanner in = new Scanner(System.in);
        input = in.next();
        in.close();
    }

    public void getUniqSequence() {
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArray = input.toCharArray();

//        for (int i = 0; i < charArray.length; i++) {
//
//        }

        for (int i = 0; i < input.length(); i++) {
            repeated = false;
            char firstIter = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {

                char secondIter = input.charAt(j);
                if (firstIter == secondIter) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                stringBuilder.append(firstIter);
            }
        }
    System.out.println(stringBuilder);
    }
}
