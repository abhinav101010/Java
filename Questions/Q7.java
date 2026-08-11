package Questions;
public class Q7{
    public static void main(String[] args) {
        String str = "level";

        int left = 0;
        int right = str.length()-1;
        boolean isPal = true;
        while(left<=right){
            if (str.charAt(left) != str.charAt(right)) {
                isPal = false;
            }
            left++;
            right--;
        }
        System.out.println(isPal);
    }
}