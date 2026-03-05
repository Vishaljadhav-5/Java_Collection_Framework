import java.util.LinkedHashMap;
// Copy data from one map to other map
public class F_LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Java");
        map1.put(2, "Python");

        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>(map1);

        System.out.println(map2);
    }
}


// Output:-

/*

{1=Java, 2=Python}

*/