package seminar1OOP;

public class Student extends Person {

    public Student(String name, int personAge) {
        super(name, personAge); // new Person(name, age);
    }

    public Student() {
        this("student", 18);
    }

    @Override
    public void setAge(int age) {
        // 18 <= age <= 25
        if (18 <= age && age <= 25) {
            super.setAge(age);
        } else {
            throw new IllegalArgumentException("18 <= age <= 25");
        }
    }

}
