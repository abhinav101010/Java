package Assignment1;
import java.util.*;

abstract class Vehicle {
    String number, customer;

    Vehicle(String number, String customer) {
        this.number = number;
        this.customer = customer;
    }

    abstract double rental(int days);
}

class Bike extends Vehicle {
    Bike(String number, String customer) {
        super(number, customer);
    }

    double rental(int days) {
        return 500 * days;
    }
}

class Car extends Vehicle {
    Car(String number, String customer) {
        super(number, customer);
    }

    double rental(int days) {
        return 1200 * days + 200 * days;
    }
}

class SUV extends Vehicle {
    SUV(String number, String customer) {
        super(number, customer);
    }

    double rental(int days) {
        return 2000 * days + 400 * days + 1000;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[6];

        for (int i = 0; i < 6; i++) {
            String number = sc.nextLine();
            String customer = sc.nextLine();
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("Bike"))
                vehicles[i] = new Bike(number, customer);
            else if (type.equalsIgnoreCase("Car"))
                vehicles[i] = new Car(number, customer);
            else
                vehicles[i] = new SUV(number, customer);
        }

        int days = sc.nextInt();
        Vehicle highest = vehicles[0];

        for (Vehicle v : vehicles) {
            double amount = v.rental(days);
            System.out.println(v.number + " " + v.customer + " " + amount);

            if (amount > highest.rental(days))
                highest = v;
        }

        System.out.println("Maximum Rental: " + highest.number + " - " + highest.rental(days));
    }
}