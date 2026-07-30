public class IntMethods {
    public static void main(String[] args) {
        // Integer.valueOf(x)
        // Integer.parseInt(x)
        // Integer.toString(x)
        // Integer.max(x, y)
        // Integer.min(x, y)
        // Integer.abs(x)
        // Integer.compare(x, y)
        // Integer.toHexString(x)
        // Integer.toOctalString(x)
        // Integer.toBinaryString(x)
        // Integer.toUnsignedString(x)
        // Integer.parseUnsignedInt(x)
        // Integer.parseInt(x, radix) : radix - 2, 8, 10, 16
        // Integer.toUnsignedInt(x)


        // Bit manuplation
        // Integer.bitCount(15);          // 4
        // Integer.highestOneBit(18);     // 16
        // Integer.lowestOneBit(18);      // 2
        // Integer.numberOfLeadingZeros(8);
        // Integer.numberOfTrailingZeros(8);
        // Integer.reverse(10);           // Reverse bits
        // Integer.reverseBytes(10);
        // Integer.rotateLeft(10, 2);
        // Integer.rotateRight(10, 2);
        // Integer.signum(-5);            // -1

        // Integer.MAX_VALUE
        // Integer.MIN_VALUE
        // Integer.SIZE       // 32 bits
        // Integer.BYTES      // 4 bytes
        // Integer.TYPE
         

        // integer.toString()
        // integer.compareTo(x)
        
        String str = "1342";
        int num1 = Integer.parseInt(str);
        int num2 = Integer.valueOf(str);
        

        System.out.println(num1);
    }
}