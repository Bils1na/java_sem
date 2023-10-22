package seminar3;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//Напишите метод, который составит строку, состаящую из 100 повторений слова TEST и
//метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
public class FirstTask {

    private static final Logger logger = Logger.getLogger(FirstTask.class.getName());

    public String stringGenerator() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String input = in.next();
        in.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(input + "\n");
        }
        return sb.toString();
    }

    public void writer() {
        try {
            FileWriter fileWriter = new FileWriter("file_system.txt", true);
            String testString = stringGenerator();
            fileWriter.write(testString);
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("Error" + exception.getMessage());
            logger.log(Level.WARNING, "Error");
        }
        logger.info("Done!");
    }

//    public void writer() throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ЯмиляАртемий\\IdeaProjects\\seminars_java\\file_system.txt");
//        String s = stringGenerator();
//        fileOutputStream.write(s.getBytes());
//        fileOutputStream.close();
//    }
}
