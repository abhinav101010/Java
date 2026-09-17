package Assignment1;

interface Delivery {
    double earnings();
}

abstract class Partner {
    int id;
    String name;
    double distance;

    Partner(int id, String name, double distance) {
        this.id = id;
        this.name = name;
        this.distance = distance;
    }

    abstract double payment();
    abstract double bonus();
    abstract String type();
}

class Bicycle extends Partner {
    Bicycle(int id, String name, double distance) {
        super(id, name, distance);
    }

    double payment() {
        return distance * 8;
    }

    double bonus() {
        return distance > 100 ? 500 : 0;
    }

    String type() {
        return "Bicycle";
    }
}

class Bike extends Partner {
    Bike(int id, String name, double distance) {
        super(id, name, distance);
    }

    double payment() {
        return distance * 10 + 50;
    }

    double bonus() {
        return distance > 100 ? 500 : 0;
    }

    String type() {
        return "Bike";
    }
}

class Car extends Partner {
    Car(int id, String name, double distance) {
        super(id, name, distance);
    }

    double payment() {
        return distance * 15 + 100;
    }

    double bonus() {
        return distance > 100 ? 500 : 0;
    }

    String type() {
        return "Car";
    }
}

public class Q8 {
    public static void main(String[] args) {
        Partner[] partners = {
            new Bicycle(1, "A", 80),
            new Bike(2, "B", 120),
            new Car(3, "C", 150),
            new Bicycle(4, "D", 90),
            new Bike(5, "E", 110)
        };

        Partner highest = partners[0];

        for (Partner p : partners) {
            double total = p.payment() + p.bonus();

            System.out.println(p.id + " " + p.name + " " +
                    p.type() + " " + total);

            if (total > highest.payment() + highest.bonus())
                highest = p;
        }

        System.out.println("Highest Earnings: " +
                highest.name + " - " +
                (highest.payment() + highest.bonus()));
    }
}