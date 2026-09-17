import java.util.*;

public class ArrayMethods {
    public static void main(String[] args) {
        int arr[] = {10,5,8,12,3,6};
        int arr2[] = {10,5,8,12,3,6};
        arr = Arrays.copyOf(arr, arr.length + arr2.length);
        System.arraycopy(arr2, 0, arr, arr.length - arr2.length, arr2.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // ============== ArrayList ==============
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        // .add() - used to add an element at the end of the list
        // .add(index, element) - used to add an element at a specific index
        // .get(index) - returns the element at the specified index
        // .set(index, element) - replaces the element at the specified index
        // .remove(index) - removes the element at the specified index
        // .size() - returns the number of elements in the list
        // .contains(element) - returns true if the list contains the specified element
        // .isEmpty() - returns true if the list is empty
        // .indexOf(element) - returns the index of the first occurrence of the specified element
        // .lastIndexOf(element) - returns the index of the last occurrence of the specified element



















        
        // Array Methods
        // Arrays.sort(arr1) - sorts the array in ascending order
        // Arrays.toString(arr1) - returns a string representation of the array
        // Arrays.deepToString(arr2) - returns a string representation of the array
        // Arrays.binarySearch(arr1, value) - searches for a value in the array
        // Arrays.copyOf(arr1, newLength) - copies the array
        // Arrays.copyOfRange(arr1, start, end) - copies a range of the array
        // Arrays.fill(arr1, value) - fills the array with a specified value
        // Arrays.equals(arr1, arr2) - compares two arrays for equality
        // Arrays.deepEquals(arr1, arr2) - compares two arrays for deep equality
        // Arrays.stream(arr1) - returns a stream of the array
        // Arrays.parallelStream(arr1) - returns a parallel stream of the array
        // Arrays.asList(arr1) - returns a fixed-size list backed by the array
        // Arrays.compare(arr1, arr2) - compares two arrays for equality
        // Arrays.reverse(arr1) - reverses the array


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).average().getAsDouble());
        
        List<String> list1 = Arrays.asList(arr).stream().map(String::valueOf).toList();
        System.out.println(list1);

        // Matrix or 2D Array
        int arr2[][] = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

        for(int row[] : arr2) {
            for(int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}