package seminar5OOP;

import java.util.List;

public class JUnitDemo {

    public <T> void move(List<? extends T> from, List<? super T> to) {
        to.addAll(from);
        from.clear();
    }

    // TDD Test Driven Development
    public String removeSpacesToUpperCase(String text) {
        return text.replaceAll("\\s++", "").toUpperCase();
    }

    /**
     * Если input = null => thorws new NullAgeException
     * Если input <= 0 => throws new NegativeAgeException
     * Если input > 0, it's ok
     */
    public void validateAge(Integer input) {
        if (input == null) {
            throw new NullAgeException();
        } else if (input <= 0) {
            throw new NegativeAgeException();
        }

    }

    public static class NullAgeException extends RuntimeException {

    }

    public static class NegativeAgeException extends RuntimeException {

    }

}
