package Assignment1;

abstract class Staff {
    int id;
    String name;
    double basicSalary;

    Staff(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        basicSalary = salary;
    }

    abstract double salary();
}

interface Responsibility {
    String responsibility();
}

class Faculty extends Staff implements Responsibility {
    Faculty(int id, String name, double salary) {
        super(id, name, salary);
    }

    double salary() {
        return basicSalary + basicSalary * .25 + basicSalary * .15;
    }

    public String responsibility() {
        return "Teaching";
    }
}

class LabAssistant extends Staff implements Responsibility {
    LabAssistant(int id, String name, double salary) {
        super(id, name, salary);
    }

    double salary() {
        return basicSalary + basicSalary * .20 + 3000;
    }

    public String responsibility() {
        return "Laboratory";
    }
}

class AdministrativeStaff extends Staff implements Responsibility {
    AdministrativeStaff(int id, String name, double salary) {
        super(id, name, salary);
    }

    double salary() {
        return basicSalary + basicSalary * .20 + 2000;
    }

    public String responsibility() {
        return "Administration";
    }
}

public class Q7 {
    public static void main(String[] args) {
        Staff[] staff = {
            new Faculty(1, "A", 40000),
            new LabAssistant(2, "B", 30000),
            new AdministrativeStaff(3, "C", 35000)
        };

        Staff highest = staff[0];

        for (Staff s : staff) {
            System.out.println(s.id + " " + s.name + " " +
                    s.salary() + " " +
                    ((Responsibility)s).responsibility());

            if (s.salary() > highest.salary())
                highest = s;
        }

        System.out.println("Highest Salary: " + highest.name +
                " - " + highest.salary());
    }
}