import java.util.LinkedHashMap;
// Removing elements

public class D_LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");

        map.remove(2);

        System.out.println(map);
    }
}
// Output:-

/*

{1=Red, 3=Green}

*/