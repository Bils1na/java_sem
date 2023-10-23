package seminar5;

//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петров
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstTask {
    private Map<Integer, String> employees;
    private String string;

    public FirstTask() { employees = new HashMap<>(); }

    public void fillAndPrintEmploeeys() {
        do {
            System.out.println("Enter key and value(123456~Ivanov) if you want to print enter command and name(print~Ivanov)");
            Scanner in = new Scanner(System.in);
            string = in.next();
            String[] values = string.split("~");
            if (!"print".equals(values[0])) {
                employees.put(Integer.parseInt(values[0]), values[1]);
            } else {
                Set<Map.Entry<Integer, String>> entries = employees.entrySet();
                for (Map.Entry<Integer, String> entry : entries) {
                    if (values[1].equals(entry.getValue())) {
                        System.out.printf("%s %s\n", entry.getKey(), entry.getValue());
                    }
                }
            }
        } while (!"Q".equals(string));
    }

//    private void fillHashMap() {
//        employees.put(123456, "Ivanov");
//        employees.put(321456, "Vasyliev");
//        employees.put(234561, "Petrov");
//        employees.put(234432, "Ivanov");
//        employees.put(654321, "Petrova");
//        employees.put(345678, "Ivanov");
//    }
//
//    public void printHashMap() {
//        fillHashMap();
//        Set<Map.Entry<Integer, String>> entries = employees.entrySet();
//            for (Map.Entry<Integer, String> entry : entries) {
//                if ("Ivanov".equals(entry.getValue())) {
//                    System.out.printf("%s %s\n", entry.getKey(), entry.getValue());
//                }
//            }
//    }



}
