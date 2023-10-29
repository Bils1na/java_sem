package seminar2OOP;

public abstract class Animal implements HasName, HasVoice{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String name() {
        return getName();
    }

    public abstract void voice();
}
