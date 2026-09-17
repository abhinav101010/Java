package Assignment1;
import java.util.*;

abstract class Patient {
    int id, days;
    String name;

    Patient(int id, String name, int days) {
        this.id = id;
        this.name = name;
        this.days = days;
    }

    abstract double bill();
}

class General extends Patient {
    General(int id, String name, int days) {
        super(id, name, days);
    }

    double bill() {
        return 500 + days * 1000;
    }
}

class Emergency extends Patient {
    Emergency(int id, String name, int days) {
        super(id, name, days);
    }

    double bill() {
        return 1000 + days * 2000 + 2500;
    }
}

class ICU extends Patient {
    ICU(int id, String name, int days) {
        super(id, name, days);
    }

    double bill() {
        return 1500 + days * 5000 + days * 2000;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[5];

        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int days = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("General"))
                patients[i] = new General(id, name, days);
            else if (type.equalsIgnoreCase("Emergency"))
                patients[i] = new Emergency(id, name, days);
            else
                patients[i] = new ICU(id, name, days);
        }

        Patient highest = patients[0];

        for (Patient p : patients) {
            System.out.println(p.id + " " + p.name + " Bill = " + p.bill());

            if (p.bill() > highest.bill())
                highest = p;
        }

        System.out.println("Highest Bill: " + highest.name + " - " + highest.bill());
    }
}