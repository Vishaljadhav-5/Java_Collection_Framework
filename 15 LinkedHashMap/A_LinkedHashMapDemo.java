
import java.util.LinkedHashMap;

public class A_LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println(map);
    }
}

// Output:-

/*

{1=Apple, 2=Banana, 3=Mango}

*/