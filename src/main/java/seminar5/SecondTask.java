package seminar5;

//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове
//повторяющиеся буквы оджного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//буква может не меняться, а остаться такой же. (Например, note - code)

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondTask {
    private String string;
    private Map<Character, Character> letters;

    public SecondTask() { letters = new HashMap<>(); }


    public void enteringWords() {
        System.out.println("Enter two words (first~second)");
        Scanner in = new Scanner(System.in);
        string = in.next();
    }

    public boolean isIsomorph() {
        enteringWords();
        String[] words = string.split("~");
        char[] arrayFirst = words[0].toCharArray();
        char[] arraySecond = words[1].toCharArray();
        for (int i = 0; i < arrayFirst.length; i++) {
            if (letters.get(arrayFirst[i]) != null) {
                if (letters.get(arrayFirst[i]) != arraySecond[i]) {
                    return false;
                }
            } else {
                letters.put(arrayFirst[i], arraySecond[i]);
            }
        }
        return true;
    }
}
