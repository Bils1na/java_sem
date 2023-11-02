package homework3OOP;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
 public static void main(String[] args) {
    Set<Employee> employees1 = new TreeSet<>();
    employees1.add(new Employee("Ben", 35, 100, "delivery"));
    employees1.add(new Employee("Bob", 25, 100, "sales"));
    employees1.add(new Employee("Tom", 24, 100, "sales"));
    employees1.add(new Employee("Steve", 41, 200, "delivery"));
    employees1.add(new Employee("Arthur", 22, 200, "delivery"));
    employees1.add(new Employee("John", 21, 150, "sales"));
    employees1.add(new Employee("Will", 34, 150, "sales"));
    employees1.add(new Employee("Alice", 35, 100, "delivery"));
    employees1.add(new Employee("Anna", 35, 100, "sales"));
    employees1.add(new Employee("Alex", 35, 150, "sales"));
    employees1.add(new Employee("Alexa", 45, 200, "sales"));
    employees1.add(new Employee("Bob", 28, 350, "manage"));
    employees1.add(new Employee("Thomas", 45, 150, "delivery"));
    employees1.add(new Employee("Kevin", 55, 100, "sales"));
    employees1.add(new Employee("Eric", 45, 100, "delivery"));
    employees1.add(new Employee("Stan", 25, 100, "sales"));
    employees1.add(new Employee("Kenni", 23, 100, "sales"));
    employees1.add(new Employee("Kyle", 33, 150, "sales"));
    employees1.add(new Employee("Butters", 31, 150, "sales"));
    employees1.add(new Employee("Randy", 35, 200, "sales"));
    employees1.add(new Employee("Tolkien", 25, 200, "sales"));
    employees1.add(new Employee("Shef", 25, 200, "sales"));
    employees1.add(new Employee("Alex", 25, 200, "sales"));
    employees1.add(new Employee("Ben", 25, 150, "sales"));
    employees1.add(new Employee("Sally", 22, 150, "sales"));
    employees1.add(new Employee("Eve", 23, 150, "sales"));
    System.out.println(employees1);


    Set<Employee> employees2 = new TreeSet<>(new EmployeeDeptComparator());
    employees2.add(new Employee("Ben", 35, 100, "delivery"));
    employees2.add(new Employee("Bob", 25, 100, "sales"));
    employees2.add(new Employee("Tom", 24, 100, "sales"));
    employees2.add(new Employee("Steve", 41, 200, "delivery"));
    employees2.add(new Employee("Arthur", 22, 200, "delivery"));
    employees2.add(new Employee("John", 21, 150, "sales"));
    employees2.add(new Employee("Will", 34, 150, "sales"));
    employees2.add(new Employee("Alice", 35, 100, "delivery"));
    employees2.add(new Employee("Anna", 35, 100, "sales"));
    employees2.add(new Employee("Alex", 35, 150, "sales"));
    employees2.add(new Employee("Alexa", 45, 200, "sales"));
    employees2.add(new Employee("Bob", 28, 350, "manage"));
    employees2.add(new Employee("Thomas", 45, 150, "delivery"));
    employees2.add(new Employee("Kevin", 55, 100, "sales"));
    employees2.add(new Employee("Eric", 45, 100, "delivery"));
    employees2.add(new Employee("Stan", 25, 100, "sales"));
    employees2.add(new Employee("Kenni", 23, 100, "sales"));
    employees2.add(new Employee("Kyle", 33, 150, "sales"));
    employees2.add(new Employee("Butters", 31, 150, "sales"));
    employees2.add(new Employee("Randy", 35, 200, "sales"));
    employees2.add(new Employee("Tolkien", 25, 200, "sales"));
    employees2.add(new Employee("Shef", 25, 200, "sales"));
    employees2.add(new Employee("Alex", 25, 200, "sales"));
    employees2.add(new Employee("Ben", 25, 150, "sales"));
    employees2.add(new Employee("Sally", 22, 150, "sales"));
    employees2.add(new Employee("Eve", 23, 150, "sales"));
    System.out.println(employees2);

    Set<Employee> employees3 = new TreeSet<>(new EmployeeSalaryComparator());
    employees3.add(new Employee("Ben", 35, 100, "delivery"));
    employees3.add(new Employee("Bob", 25, 100, "sales"));
    employees3.add(new Employee("Tom", 24, 100, "sales"));
    employees3.add(new Employee("Steve", 41, 200, "delivery"));
    employees3.add(new Employee("Arthur", 22, 200, "delivery"));
    employees3.add(new Employee("John", 21, 150, "sales"));
    employees3.add(new Employee("Will", 34, 150, "sales"));
    employees3.add(new Employee("Alice", 35, 100, "delivery"));
    employees3.add(new Employee("Anna", 35, 100, "sales"));
    employees3.add(new Employee("Alex", 35, 150, "sales"));
    employees3.add(new Employee("Alexa", 45, 200, "sales"));
    employees3.add(new Employee("Bob", 28, 350, "manage"));
    employees3.add(new Employee("Thomas", 45, 150, "delivery"));
    employees3.add(new Employee("Kevin", 55, 100, "sales"));
    employees3.add(new Employee("Eric", 45, 100, "delivery"));
    employees3.add(new Employee("Stan", 25, 100, "sales"));
    employees3.add(new Employee("Kenni", 23, 100, "sales"));
    employees3.add(new Employee("Kyle", 33, 150, "sales"));
    employees3.add(new Employee("Butters", 31, 150, "sales"));
    employees3.add(new Employee("Randy", 35, 200, "sales"));
    employees3.add(new Employee("Tolkien", 25, 200, "sales"));
    employees3.add(new Employee("Shef", 25, 200, "sales"));
    employees3.add(new Employee("Alex", 25, 200, "sales"));
    employees3.add(new Employee("Ben", 25, 150, "sales"));
    employees3.add(new Employee("Sally", 22, 150, "sales"));
    employees3.add(new Employee("Eve", 23, 150, "sales"));
    System.out.println(employees3);


 }  
} 

class EmployeeDeptComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee first, Employee second) {
        return first.getDept().length() - second.getDept().length();
    }
}

class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee first, Employee second) {
        return second.getSalary() - first.getSalary();
    }
}

