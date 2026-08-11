import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        float flt = sc.nextFloat();
        double dbl = sc.nextDouble();
        char ch = sc.next().charAt(0);
        sc.close();
        
        System.out.println(num);
        System.out.println(str);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(ch);
    }
}