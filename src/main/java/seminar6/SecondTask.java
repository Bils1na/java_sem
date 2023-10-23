package seminar6;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью sEt вычислите процент
//уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных числе = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.*;


public class SecondTask {
    private Integer[] digits;

    public SecondTask() {
        digits = new Integer[1000];
    }

    public void fillRandomDigits() {
        Random rnd = new Random();
        for (int i = 0; i < digits.length; i++) {
            digits[i] = rnd.nextInt(0, 24);
        }
    }

    public void persentUniq() {
        fillRandomDigits();
        HashSet<Integer> hSet = new HashSet<>(Arrays.asList(digits));
        double arraySize = digits.length, setSize = hSet.size();
        double result = (setSize * 100) / arraySize;
        System.out.println(result);
    }

}
