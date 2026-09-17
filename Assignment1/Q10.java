package Assignment1;
import java.util.*;

abstract class Pass {
    String id, name;
    int months;

    Pass(String id, String name, int months) {
        this.id = id;
        this.name = name;
        this.months = months;
    }

    abstract double baseAmount();
    abstract double discount();
    abstract double finalAmount();
    abstract String type();
}

interface PassOperation {
    String type();
}

class StudentPass extends Pass implements PassOperation {
    StudentPass(String id, String name, int months) {
        super(id, name, months);
    }

    double baseAmount() {
        return 800 * months;
    }

    double discount() {
        return months >= 6 ? baseAmount() * .10 : 0;
    }

    double finalAmount() {
        return baseAmount() - discount();
    }

    public String type() {
        return "Student";
    }
}

class FacultyPass extends Pass implements PassOperation {
    FacultyPass(String id, String name, int months) {
        super(id, name, months);
    }

    double baseAmount() {
        return 1200 * months;
    }

    double discount() {
        return months == 12 ? baseAmount() * .15 : 0;
    }

    double finalAmount() {
        return baseAmount() - discount();
    }

    public String type() {
        return "Faculty";
    }
}

class GuestPass extends Pass implements PassOperation {
    GuestPass(String id, String name, int months) {
        super(id, name, months);
    }

    double baseAmount() {
        return 1500 * months + 300;
    }

    double discount() {
        return 0;
    }

    double finalAmount() {
        return baseAmount();
    }

    public String type() {
        return "Guest";
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pass[] passes = new Pass[8];

        for (int i = 0; i < 8; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int months = sc.nextInt();
            sc.nextLine();

            if (type.equalsIgnoreCase("Student"))
                passes[i] = new StudentPass(id, name, months);
            else if (type.equalsIgnoreCase("Faculty"))
                passes[i] = new FacultyPass(id, name, months);
            else
                passes[i] = new GuestPass(id, name, months);
        }

        Pass highest = passes[0];
        double revenue = 0;

        for (Pass p : passes) {
            System.out.println("Pass ID: " + p.id);
            System.out.println("Name: " + p.name);
            System.out.println("Pass Type: " + p.type());
            System.out.println("Duration: " + p.months + " months");
            System.out.println("Base Amount: ₹" + p.baseAmount());
            System.out.println("Discount: ₹" + p.discount());
            System.out.println("Final Amount: ₹" + p.finalAmount());

            revenue += p.finalAmount();

            if (p.finalAmount() > highest.finalAmount())
                highest = p;
        }

        System.out.println("Total Revenue: ₹" + revenue);
        System.out.println("Highest Paying Pass Holder:");
        System.out.println("Name: " + highest.name);
        System.out.println("Amount: ₹" + highest.finalAmount());
    }
}