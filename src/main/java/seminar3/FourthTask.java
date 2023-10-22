package seminar3;

//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Iterator;

public class FourthTask {
    private ArrayList<String> stringsDigits = new ArrayList<>();

    public FourthTask() {
        stringsDigits.add("a");
        stringsDigits.add("b");
        stringsDigits.add("c");
        stringsDigits.add(String.valueOf(1));
        stringsDigits.add(String.valueOf(1.6));
        stringsDigits.add(String.valueOf(4));
        stringsDigits.add(String.valueOf(5));
        stringsDigits.add(String.valueOf(7.5));
        stringsDigits.add("d");
        stringsDigits.add("e");
        stringsDigits.add("f");
    }

    public void removeDigits() {
//        System.out.println(stringsDigits);
//        for (int i = 0; i < 3; i++) {
//            if (stringsDigits.get(i).matches("(\\d+)|([\\+-]?\\d+)")) {
//                stringsDigits.remove(i);
//            }
//        }
        Iterator<String> iterator = stringsDigits.iterator();
//        [|1, 2, 3, 4, 5]   | - star position
        while (iterator.hasNext()) {
            String next = iterator.next();
//            [1, 2, 3, 4] next - takes next element
            if (next.matches("(\\d+)|([\\+-]?\\d+)")) {
                iterator.remove();
                System.out.println(next);
            }
        }
        System.out.println(stringsDigits);
    }
}
