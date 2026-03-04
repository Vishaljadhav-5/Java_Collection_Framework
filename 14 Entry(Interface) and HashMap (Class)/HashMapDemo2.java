import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2
{
    public static void main(String[] args) 
    {
        HashMap<Object,Object> hm2 = new HashMap<>();
        hm2.put(101, "Vishal");
        hm2.put(102, "Komal");
        hm2.put(103, "Uday");
        hm2.put(104, "Abhishek");
        hm2.put(105, "Vijay");

        
        System.out.println(hm2);

        Set set = hm2.entrySet();
        System.out.println(set);

        System.out.println("--------------------------");

        Iterator<Object> itr = set.iterator();

        while (itr.hasNext()) {
            // System.out.println(itr.next());

            Map.Entry<Object,Object> entry = (Map.Entry<Object,Object>) itr.next();

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("==================================");
        }

    }
}

// Output:-

/*

{101=Vishal, 102=Komal, 103=Uday, 104=Abhishek, 105=Vijay}
[101=Vishal, 102=Komal, 103=Uday, 104=Abhishek, 105=Vijay]
--------------------------
101
Vishal
==================================
102
Komal
==================================
103
Uday
==================================
104
Abhishek
==================================
105
Vijay
==================================

*/

