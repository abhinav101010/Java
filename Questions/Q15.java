package Questions;
import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        // Write a program to store n student names in an array list and display all names

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        String names = scanner.nextLine();
        for (String name : names.split(" ")) {
            studentNames.add(name);
        }
        for (String name : studentNames) {
            System.out.println(name);
        }
        scanner.close();
    }
}