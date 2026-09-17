import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key", 1);
        System.out.println(map.get("key"));

        // HashMap methods:
        // put(key, value) - adds a key-value pair to the map
        // get(key) - returns the value associated with the key
        // remove(key) - removes the key-value pair associated with the key
        // containsKey(key) - returns true if the map contains the key
        // containsValue(value) - returns true if the map contains the value
        // size() - returns the number of key-value pairs in the map
        // clear() - removes all key-value pairs from the map?
        
    }
}