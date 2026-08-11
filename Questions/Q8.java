package Questions;
public class Q8{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;

        // Primary Diagonal Sum
        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         if(i == j) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }


        // Secondary Diagonal Sum
        // sum = 0;
        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         if(i + j == arr.length - 1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        for(int i = 0; i < arr.length; i++) { 
            sum += arr[i][i];
        }
        System.out.println(sum);
        
        sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - 1 - i];
        }
        System.out.println(sum);
    }
}