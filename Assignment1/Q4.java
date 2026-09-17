package Assignment1;
import java.util.*;

interface Payment {
    double charge();
    double discount();
    String getMethod();
}

class UPI implements Payment {
    double amount;

    UPI(double amount) {
        this.amount = amount;
    }

    public double charge() {
        return amount * 0.01;
    }

    public double discount() {
        return amount > 10000 ? 200 : 0;
    }

    public String getMethod() {
        return "UPI";
    }
}

class CreditCard implements Payment {
    double amount;

    CreditCard(double amount) {
        this.amount = amount;
    }

    public double charge() {
        return amount * 0.025;
    }

    public double discount() {
        return amount > 10000 ? 200 : 0;
    }

    public String getMethod() {
        return "Credit Card";
    }
}

class NetBanking implements Payment {
    double amount;

    NetBanking(double amount) {
        this.amount = amount;
    }

    public double charge() {
        return amount * 0.015;
    }

    public double discount() {
        return amount > 10000 ? 200 : 0;
    }

    public String getMethod() {
        return "Net Banking";
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment[] payments = new Payment[5];
        double[] amounts = new double[5];

        for (int i = 0; i < 5; i++) {
            String type = sc.nextLine();
            double amount = sc.nextDouble();
            sc.nextLine();
            amounts[i] = amount;

            if (type.equalsIgnoreCase("UPI"))
                payments[i] = new UPI(amount);
            else if (type.equalsIgnoreCase("Credit Card"))
                payments[i] = new CreditCard(amount);
            else
                payments[i] = new NetBanking(amount);
        }

        Payment highest = payments[0];

        for (int i = 0; i < 5; i++) {
            Payment p = payments[i];
            double finalAmount = amounts[i] + p.charge() - p.discount();

            System.out.println(p.getMethod());
            System.out.println("Original Amount: " + amounts[i]);
            System.out.println("Transaction Charge: " + p.charge());
            System.out.println("Discount: " + p.discount());
            System.out.println("Final Amount: " + finalAmount);

            if (p.charge() > highest.charge())
                highest = p;
        }

        System.out.println("Highest Transaction Charge: " + highest.getMethod());
    }
}