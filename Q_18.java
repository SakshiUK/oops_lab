// Write a program to implement following inheritance. Accept data for 5 persons and display the name of employee having salary greater than 5000.

Class Name: Person
Member variables:
Name, age

Class Name: Employee
Member variables:
Designation, salary
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public boolean hasSalaryGreaterThan(double amount) {
        return salary > amount;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        System.out.println("Enter details of 5 persons:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            employees[i] = new Employee(name, age, designation, salary);
        }

        System.out.println("\nEmployees with salary greater than 5000:");

        for (Employee employee : employees) {
            if (employee.hasSalaryGreaterThan(5000)) {
                System.out.println("Name: " + employee.name);
            }
        }
    }
}
