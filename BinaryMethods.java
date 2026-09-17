public class BinaryMethods {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java BinaryMethods <binary>");
            return;
        }
        String binary = args[0];
        int decimal = binaryToDecimal(binary);
        System.out.println(decimal);

        String binary2 = decimalToBinary(decimal);
        System.out.println(binary2);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                return -1;
            }
            decimal = decimal * 2 + (c - '0');
        }
        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }
}