public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        System.out.println(a + b); // Addition
        System.out.println(a - b); // Subtraction
        System.out.println(a * b); // Multiplication
        System.out.println(a / b); // Division
        System.out.println(a % b); // Modulus
        System.out.println(a++); // Increment
        System.out.println(a--); // Decrement
        System.out.println(a > b); // Greater than
        System.out.println(a < b); // Less than
        System.out.println(a == b); // Equal to
        System.out.println(a != b); // Not equal to
        System.out.println(a & b); // Bitwise AND  1010 & 0011 = 0010
        System.out.println(a | b); // Bitwise OR  1010 | 0011 = 1011
        System.out.println(a ^ b); // Bitwise XOR  1010 ^ 0011 = 1001
        System.out.println(~a); // Bitwise NOT  ~1010 = 0101
        System.out.println(a << 2); // Left shift  1010 << 2 = 101000
        System.out.println(a >> 2); // Right shift  1010 >> 2 = 0010
        System.out.println(a >>> 2); // Unsigned right shift  1010 >>> 2 = 0010
    }
}