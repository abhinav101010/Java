package Questions;
import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String newStr = new StringBuilder(str).reverse().toString();
        System.out.println(newStr);
        sc.close();
        int num = Integer.valueOf(str);
        int ans = 0;
        while (num > 0) {
            ans = ans*10+num%10;
            num /= 10;
        }
        System.out.println(ans);
    }
}