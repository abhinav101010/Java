package Questions;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.contains("@"));
        System.out.println(str.contains(".com"));
        scanner.close();
    }
}