package seminar4;

//Реализовать консольное прилоение, которое:
//Принимает от пользователя строку вида
//text~num
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num выводи строку из позиции num в связном списке и удаляет ее из списка.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SecondTask {
    private String string;

    public void addToLinkedList() {
        LinkedList<String> list = new LinkedList<>();
//        Deque<String> deque = new LinkedList<>();
        do {
            Scanner in = new Scanner(System.in);
            string = in.next();
            String[] splited = string.split("~");
            int num = Integer.parseInt(splited[1]);

            if (!"print".equals(splited[0])) {
                if (list.size() < num) {
                    for (int i = list.size(); i < num * 2; i++) {
                        list.add(i, null);
                    }
                }
                list.set(num, splited[0]);
            } else {
                if (num <= list.size()) {
                    System.out.println((list));
                    System.out.println(list.get(num));
                    String remove = list.remove(num);
                    System.out.println("Deleted " + remove);
                    System.out.println(list);
                }
            }

//            list.add(Integer.parseInt(splited[1]), splited[0]);
//            list.set(Integer.parseInt(splited[1]), splited[0]);


        } while (!"Q".equals(string));
    }
}
