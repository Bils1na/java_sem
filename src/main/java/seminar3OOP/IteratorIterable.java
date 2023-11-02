package seminar3OOP;

import java.util.Iterator;
import java.util.List;

public class IteratorIterable {
    public static void main(String[] args) {
        // Iterable<T> iterable -> Iterator<T> iterator = iterable.iterator();

        // List<Integer> ints = List.of(1, 2, 3, 4, 5);
        // Iterator<Integer> iterator = ints.iterator();

        // for (Integer x: ints) {
        //     System.out.println(x);
        // }

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // Telegram telegram = new Telegram();
        // for (TelegramChat chat: telegram) {

        // }

        // Iterator<TelegramChat> chatIterator = telegram.iterator();
        // while (chatIterator.hasNext()) {
        //     System.out.println(chatIterator.next());
        // }

        Iterator<String> iterator = null;

        Iterable<String> iterable = () -> iterator;

        Iterator<String> iterator1 = iterable.iterator();

    }

    class Telegram implements Iterable<TelegramChat> {

        private List<TelegramChat> chats;

        @Override
        public Iterator<TelegramChat> iterator() {
            return chats.iterator();
        }
    }

    class TelegramChat {

    }
}
