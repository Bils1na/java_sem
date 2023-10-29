package seminar2OOP;

public class Person implements HasName {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
