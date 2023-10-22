package seminar3;

//Даны следующие строки, сравнить их с помощью == и метода  equals() класса Object
//String s1 = "hello";
//String s2 = "hello";
//String se = s1;
//String s4 = "h" + "e" + "l" + "l" + "o";
//String s5 = new String("hello");
//String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SecondTask {

    public static void comparing() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

//        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));

//        strings.add(s1);
//        strings.add(s2);
//        strings.add(s3);
//        strings.add(s4);
//        strings.add(s5);
//        strings.add(s6);

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                boolean flag = strings.get(i) == strings.get(j);
                System.out.println((i + 1) + " " + (j + 1) + " == " + flag);
                System.out.println((i + 1) + " " + (j + 1) + " equals " + strings.get(i).equals(strings.get(j)));
                System.out.println("-------------------------------------");
            }
        }
    }
}
