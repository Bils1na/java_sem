package homework3OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
 public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Ben", 35, 100, "delivery"));
    employees.add(new Employee("Bob", 25, 100, "sales"));
    employees.add(new Employee("Tom", 24, 100, "sales"));
    employees.add(new Employee("Steve", 41, 200, "delivery"));
    employees.add(new Employee("Arthur", 22, 200, "delivery"));
    employees.add(new Employee("John", 21, 150, "sales"));
    employees.add(new Employee("Will", 34, 150, "sales"));
    employees.add(new Employee("Alice", 35, 100, "delivery"));
    employees.add(new Employee("Anna", 35, 100, "sales"));
    employees.add(new Employee("Alex", 35, 150, "sales"));
    employees.add(new Employee("Alexa", 45, 200, "sales"));
    employees.add(new Employee("Bob", 28, 350, "manage"));
    employees.add(new Employee("Thomas", 45, 150, "delivery"));
    employees.add(new Employee("Kevin", 55, 100, "sales"));
    employees.add(new Employee("Eric", 45, 100, "delivery"));
    employees.add(new Employee("Stan", 25, 100, "sales"));
    employees.add(new Employee("Kenni", 23, 100, "sales"));
    employees.add(new Employee("Kyle", 33, 150, "sales"));
    employees.add(new Employee("Butters", 31, 150, "sales"));
    employees.add(new Employee("Randy", 35, 200, "sales"));
    employees.add(new Employee("Tolkien", 25, 200, "sales"));
    employees.add(new Employee("Shef", 25, 200, "sales"));
    employees.add(new Employee("Alex", 25, 200, "sales"));
    employees.add(new Employee("Ben", 25, 150, "sales"));
    employees.add(new Employee("Sally", 22, 150, "sales"));
    employees.add(new Employee("Eve", 23, 150, "sales"));
    Collections.sort(employees);

    Collections.sort(employees, new EmployeeDeptComparator());
    System.out.println(employees);

    Collections.sort(employees, new EmployeeSalaryComparator());
    System.out.println(employees);


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

