package seminar5;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//Пример 1: a+(d*3) - true
//Пример 2: [a+(1*3) - false
//Пример 3: [6+(3*3)] - true
//Пример 4: {a}[+]{(d*3)} - true
//Пример 5: <{a}+{(d*3)}> - true
//Пример 6: {a+]}{(d*3)} - false

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ThirdTask {
    private Map<Character, Character> brackets;

    public ThirdTask() { brackets = new HashMap<>(); }

    public boolean searchBrackets() {
        String input = "[a+(d*3)";
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put('<', '>');
        Deque<Character> stack = new LinkedList<>();

        for (char c : input.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
