import java.util.*;
// Conveert map to list

public class G_LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 100);
        map.put("B", 200);

        List<String> keys = new ArrayList<>(map.keySet());

        System.out.println(keys);
    }
}

// Output:-

/*

[A, B]

*/