public class Loops {
    public static void main(String[] args) {
        // Loops
        // for loop
        // while loop
        // do-while loop
        // for-each loop
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);        

        int[] arr = {10,5,8,12,3,6};
        for (int num : arr) {
            System.out.println(num);
        }        
    }
}