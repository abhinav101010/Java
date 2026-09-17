import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Variables {
    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        
        String name = "John";
        char charValue = 'A';
        
        boolean isStudent = false;
        float salary = 50000.0f;
        
        double bonus = 10000.0;

        Set set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        for (Object num : set) {
            System.out.println(num);
        }
        
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<Object, Object> objMap = new HashMap<>();
        objMap.put("a", 1);
        objMap.put(2, 2);
        objMap.put(3, true);
        for (Map.Entry<Object, Object> entry : objMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(objMap.get("a"));
        System.out.println(objMap.get(2));
        System.out.println(objMap.get(3));
        
    }
}