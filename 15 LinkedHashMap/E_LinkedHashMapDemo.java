import java.util.LinkedHashMap;

public class E_LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>(16, 0.75f, true);

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.get(1);
        map.get(2);

        System.out.println(map);
    }
}


// Output:-

/*

{3=Three, 1=One, 2=Two}

*/