class Calculator {
    int calculate(int a, int b) {
        int result = a + b;
        return result;
    }

    int calculate(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    double calculate(double a, double b) {
        return (double) (a*b);
    }

    String calculate(String a, String b) {
        return a + b;
    }
}

public class ClassesQ20 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.calculate(5, 3);
        int result2 = calculator.calculate(5, 3, 2);
        double result3 = calculator.calculate(2.5, 3.5);
        String result4 = calculator.calculate("Hello", "World");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}