package seminar1OOP;

public class Program {
    public static void main(String[] args) {
        // 1. Инкапсуляция
        Person person = new Person("Igotr", 250);

        String personName = person.getName();

        // 2. Наследование
        Person defaultPerson = new Person();
        System.out.println(defaultPerson.getName());
        System.out.println(defaultPerson.getAge());

        Student defaultStudent = new Student();
        System.out.println(defaultStudent.getName());
        System.out.println(defaultStudent.getAge());

        // 3. Полиморфизм


    }
}
