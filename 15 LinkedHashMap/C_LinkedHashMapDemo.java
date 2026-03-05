import java.util.LinkedHashMap;

public class C_LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        System.out.println(map.containsKey("A"));   // true
        System.out.println(map.containsValue(30));  // false
    }
}

// Output:-

/*

true
false

*/