package Assignment1;
import java.util.*;

abstract class Student {
    int roll;
    String name, course;

    Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    abstract double examFee();
    abstract double concession();
    abstract double labFee();
    abstract double finalAmount();
    abstract String getCategory();
}

class Regular extends Student {
    Regular(int r, String n, String c) {
        super(r, n, c);
    }

    double examFee() { return 1200; }
    double concession() { return 0; }
    double labFee() { return 300; }
    double finalAmount() { return 1500; }
    String getCategory() { return "Regular"; }
}

class Scholarship extends Student {
    Scholarship(int r, String n, String c) {
        super(r, n, c);
    }

    double examFee() { return 1200; }
    double concession() { return 600; }
    double labFee() { return 300; }
    double finalAmount() { return 900; }
    String getCategory() { return "Scholarship"; }
}

class Supplementary extends Student {
    Supplementary(int r, String n, String c) {
        super(r, n, c);
    }

    double examFee() { return 1500; }
    double concession() { return 0; }
    double labFee() { return 500; }
    double finalAmount() { return 2000; }
    String getCategory() { return "Supplementary"; }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[6];

        for (int i = 0; i < 6; i++) {
            int roll = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String course = sc.nextLine();
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("Regular"))
                students[i] = new Regular(roll, name, course);
            else if (type.equalsIgnoreCase("Scholarship"))
                students[i] = new Scholarship(roll, name, course);
            else
                students[i] = new Supplementary(roll, name, course);
        }

        Student highest = students[0];

        for (Student s : students) {
            System.out.println("Roll No: " + s.roll);
            System.out.println("Name: " + s.name);
            System.out.println("Category: " + s.getCategory());
            System.out.println("Exam Fee: " + s.examFee());
            System.out.println("Concession: " + s.concession());
            System.out.println("Lab Fee: " + s.labFee());
            System.out.println("Final Amount: " + s.finalAmount());

            if (s.finalAmount() > highest.finalAmount())
                highest = s;
        }

        System.out.println("Highest: " + highest.name);
    }
}