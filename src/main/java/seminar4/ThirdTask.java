package seminar4;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и "запоминает" строки.
//Если введено print, выводит строки так, чтобы последняя введеная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введеную строку из памяти.

import java.util.Scanner;
import java.util.Stack;

public class ThirdTask {
    String string;

    public void solvation() {
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        do {
            string = in.next();
            if (!"print".equals(string) && !"revert".equals(string)) {
                stack.push(string);
            } else if ("print".equals(string)) {
                System.out.println("Print");
                for (int i = stack.size() - 1; i >= 0; i--) {
                    System.out.println(stack.elementAt(i));
                }
                System.out.println(stack);
            } else if ("revert".equals(string)) {
                System.out.println("Revert");
                System.out.println(stack.pop());
                System.out.println(stack);
            }
        } while (!"Q".equals(string));
    }
}
