package seminar2;

import java.util.Scanner;

//Напишите метод, который принимает на вход строку и определяет является ли строка палиндромом (возвращает boolean значение)
public class ThirdTask {
    String input;

    public ThirdTask() {
    Scanner in = new Scanner(System.in);
    input = in.nextLine();
    in.close();
    }

    public void getReversedWord() {
        String word = input;
        StringBuilder stringBuilder = new StringBuilder(word);
        StringBuilder stringBuilderReversed = new StringBuilder(word);

        if (stringBuilder.toString().equals(stringBuilderReversed.reverse().toString())) {
            System.out.println("This is polindrom");
        } else {
            System.out.println("This is not polindrom");
        }
    }

}
