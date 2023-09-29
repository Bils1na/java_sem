package homeworkI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClassHomeworkOne {
    public static void main(String[] args) throws IOException {
        int taskOneResult = task1(4);
        System.out.printf("Task 1: %d\n", taskOneResult); // task1

        System.out.println("Task 2:"); // task2
        task2();

        int taskThreeResult = task3('+', 1, 4);
        System.out.printf("Task 3: %d", taskThreeResult); // task3

        String file = "input.txt"; // task 4
        String taskFourResult = task4(file);
        System.out.println("\nTask 4: ");
        System.out.println(taskFourResult);
    }

    public static int task1(int n) {
//        Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//        Внутри класса Answer напишите метод countNTriangle,
//        который принимает число n и возвращает его n-ое треугольное число.
//        Пример
//        n = 4 -> 10
//        n = 5 -> 15

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void task2() {
//        Напишите функцию printPrimeNums, которая выведет на экран все простые числа в
//        промежутке от 1 до 1000, каждое на новой строке.
//        Напишите свой код в методе printPrimeNums класса Answer.
//        Пример
//        1
//        2
//        3
//        5
//        7
//        11
//        ...

        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= 1000; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2 || i == 1) {
                System.out.println(i);
            }
        }
    }

    public static int task3(char op, int a, int b) {
//        Напишите класс Calculator, который будет выполнять математические операции
//        (+, -, *, /) над двумя числами и возвращать результат. В классе должен
//        быть метод calculate, который принимает оператор и значения аргументов
//        и возвращает результат вычислений.

        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }

    public static String task4(String str) throws IOException {
//        В файле задано уравнение вида q + w = e (q, w, e >= 0).
//        Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69
//        Восстановите выражение до верного равенства.
//        Предложите хотя бы одно решение или сообщите, что его нет.
//        Напишите класс Equation, содержащий метод getSolution,
//        который будет считывать уравнение из файла и восстановит его до верного равенства.
//        Выведите сначала строку формата "Given the equation: {выражение из файла}".
//        А затем верните строку формата "Result: {цельное выражение}".
//        Если выражение не имеет решений - верните строку "No solution".
//        Пример
//        Given the equation: ? + 4 = 9
//        Result: 5 + 4 = 9

        BufferedReader br = new BufferedReader(new FileReader(str)); // открываем файл для чтения
        String line = br.readLine();
        br.close();

        String[] parts = line.split("\\s*[+=]\\s*");
        String firstPart = parts[0];
        String secondPart = parts[1];
        String thirdPart = parts[2];

        for (char digit = '0'; digit <= '9'; digit++) {
            String firstPartWithDigit = firstPart.replace("?", String.valueOf(digit));
            for (char digitOne = '0'; digitOne <= '9'; digitOne++) {
                String secondPartWithDigit = secondPart.replace("?", String.valueOf(digitOne));
                int firstValue = Integer.parseInt(firstPartWithDigit);
                int secondValue = Integer.parseInt(secondPartWithDigit);
                int thirdValue = Integer.parseInt(thirdPart);
                if (firstValue + secondValue == thirdValue) {
                    return "Given the equation: " + line + "\nResult: " +
                            firstPartWithDigit + " + " + secondPartWithDigit + " = " +
                            thirdPart;
                }
            }
        }
        return "No solution.";
    }
}
