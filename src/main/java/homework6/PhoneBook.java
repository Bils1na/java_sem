package homework6;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    private String input;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void phoneBookFunctionality() {
        do {
            System.out.println("\nEnter contact and his number (Example: Igor,8(985)300-20-13)");
            System.out.println("If you want to print phone book, you can enter 'print'\n");
            Scanner in = new Scanner(System.in);
            input = in.next();
            String[] contact = input.split(",");
            if (!"print".equals(input)) {
                if (phoneBook.containsKey(contact[0].toLowerCase())) {
                    List<String> numbers = phoneBook.get(contact[0].toLowerCase());
                    numbers.add(contact[1]);
                } else {
                    List<String> numbers = new ArrayList<>();
                    numbers.add(contact[1]);
                    phoneBook.put(contact[0].toLowerCase(), numbers);
                }
            } else {
                printPhoneBook();
            }

        } while (!"Q".equals(input));
    }

    public void printPhoneBook() {
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.printf("%s%s - %s\n", entry.getKey().substring(0, 1).toUpperCase(),
                    entry.getKey().substring(1), entry.getValue());
        }

    }}
