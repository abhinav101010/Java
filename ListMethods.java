import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        // List<Integer> list3 = Arrays.asList(1, 2, 3);
        System.err.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(1);
        list2.add(4);
        list2.add(3);
        System.out.println(list2);

        // List methods
        // list2.add(1) - adds an element to the end of the list
        // list2.addAll(b) - adds all the elements of the specified collection to the end of the list
        // list2.remove(0) - removes an element from the list
        // list2.get(0) - gets the element at the specified index
        // list2.size() - gets the number of elements in the list
        // list2.set(0,10) - sets the element at the specified index
        // list2.clear() - removes all elements from the list
        // list2.contains(1) - returns true if the list contains the specified element
        // list2.indexOf(1) - returns the index of the specified element
        // list2.lastIndexOf(1) - returns the index of the last occurrence of the specified element
        // list2.subList(0,2) - returns a view of the portion of the list between the specified indices
        // list2.toArray() - returns an array containing all the elements in the list
        // a.retainAll(b); - retains only the elements in this list that are contained in the specified collection
        // a.removeAll(b); - removes from this list all the elements that are contained in the specified collection
        // list1.equals(list2); - returns true if the two lists contain the same elements in the same order
        // list.forEach(System.out::println); - prints each element of the list

        
        // Collection Utility methods
        // Collections.sort(list);
        // Collections.reverse(list);
        // Collections.shuffle(list);
        // Collections.max(list);
        // Collections.min(list);
        // Collections.frequency(list, 5);
        // Collections.swap(list, 0, 2);
        // Collections.fill(list, 10);
    }
}