package seminar1OOP;

public class Person {

    // private -   доступен только внутри класса
    // public -    доступен всем и отовсюду
    // protected - доступен внутри пакета плюс наследники
    // default -   доступен внутри пакета

    private String name;
    private int age;

    public Person() {
        this("unnamed", 1);
//        this.name = "unnamed";
//        this.age = 1;
    }

    public Person(String name, int personAge) {
        this.name = name;
        setAge(personAge);
    }

    public void setName(String personName) {
        this.name = personName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int personAge) {
        if (personAge > 0) {
            this.age = personAge;
        } else {
            throw new IllegalArgumentException("Age > 0");
        }
    }

    public int getAge() {
        return age;
    }
}
