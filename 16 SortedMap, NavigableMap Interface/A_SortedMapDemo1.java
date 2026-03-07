import java.util.SortedMap;
import java.util.TreeMap;

public class A_SortedMapDemo1
 {
    public static void main(String[] args) {
        SortedMap<Object,Object> sm1 = new TreeMap<>();

        sm1.put(101, "Vishal");
        sm1.put(102, "Uday");
        sm1.put(103, "Komal");
        sm1.put(104, "Vijay");
        sm1.put(105, "Aadity");

        System.out.println(sm1);
        System.out.println("firstKey() method : " + sm1.firstKey());
        System.out.println("lastKey() method : " + sm1.lastKey());
        System.out.println("headMap(-) method : Given entry not included --> " + sm1.headMap(104)); // 104 entry not included
        System.out.println("tailMap(-) method : Given entry included --> " + sm1.tailMap(102)); // 102 entry included
        System.out.println("subMap(-,-) method : Last given entry not included" + sm1.subMap(102,104)); // 104 is not included here

    }
}

// Output:-

/*

{101=Vishal, 102=Uday, 103=Komal, 104=Vijay, 105=Aadity}
firstKey() method : 101
lastKey() method : 105
headMap(-) method : Given entry not included --> {101=Vishal, 102=Uday, 103=Komal}
tailMap(-) method : Given entry included --> {102=Uday, 103=Komal, 104=Vijay, 105=Aadity}
subMap(-,-) method : Last given entry not included{102=Uday, 103=Komal}

*/