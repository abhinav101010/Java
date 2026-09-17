package Assignment1;
import java.util.*;

abstract class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();
    abstract String getType();
}

class PermanentEmployee extends Employee {
    PermanentEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return basicSalary + basicSalary * 0.20 + basicSalary * 0.10;
    }

    String getType() {
        return "Permanent";
    }
}

class ContractEmployee extends Employee {
    ContractEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return basicSalary + 5000;
    }

    String getType() {
        return "Contract";
    }
}

class Intern extends Employee {
    Intern(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return 15000;
    }

    String getType() {
        return "Intern";
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            double salary = sc.nextDouble();

            if (type.equalsIgnoreCase("Permanent"))
                employees[i] = new PermanentEmployee(id, name, salary);
            else if (type.equalsIgnoreCase("Contract"))
                employees[i] = new ContractEmployee(id, name, salary);
            else
                employees[i] = new Intern(id, name, salary);
        }

        Employee highest = employees[0];

        for (Employee e : employees) {
            System.out.println(e.id + " " + e.name + " " +
                    e.getType() + " Salary = " + e.calculateSalary());

            if (e.calculateSalary() > highest.calculateSalary())
                highest = e;
        }

        System.out.println("Highest Salary:");
        System.out.println(highest.name + " - " + highest.calculateSalary());
    }
}