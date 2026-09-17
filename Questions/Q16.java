package Questions;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // int[] arr = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=scanner.nextInt();
            // arr[i] = scanner.nextInt();
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+sum/n);
        scanner.close();
        
        // sum
        // for (int i = 0; i < n; i++) {
        //     sum += arr[i];
        // }
        // System.out.println(sum/n);
        // System.out.println(sum);
    }
}