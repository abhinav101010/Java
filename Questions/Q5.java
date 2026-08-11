package Questions;
import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0;
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}