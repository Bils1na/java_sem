package homework3OOP;


public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;
    private String dept;

    public Employee(String name, int age, int salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public int compareTo(Employee employee) {
        return age - employee.getAge();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age:" + age + ", salary:" + salary + ", dept:" + dept; 
    }
    
}
