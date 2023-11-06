package seminar4OOP;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Number> {

    private List<T> numbers;

    public Storage() {
        this.numbers = new ArrayList<>();
    }

    public void add(T x) {
        numbers.add(x);
    }

    public int sum() {
        int sum = 0;
        for (T number : numbers) {
            sum += number.intValue();
        }
        return sum;
    }
}
