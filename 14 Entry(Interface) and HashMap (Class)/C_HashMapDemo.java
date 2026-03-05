import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C_HashMapDemo
{
    public static void main(String[] args) 
    {
        HashMap<Object,Object> hm2 = new HashMap<>();
        hm2.put("101", "Vishal");
        hm2.put("102", "Komal");
        hm2.put("103", "Uday");
        hm2.put("104", "Abhishek");
        hm2.put("105", "Vijay");


        //To store the new map
        HashMap<Object,Object> hm22 = new HashMap<>();

        Set set = hm2.entrySet();

        Iterator<Object> itr = set.iterator();

        while (itr.hasNext()) {
            // System.out.println(itr.next());

            Map.Entry<Object,Object> entry = (Map.Entry<Object,Object>) itr.next();

           if (entry.getKey().equals("103")) 
            {
                entry.setValue("aaa");
                hm22.put(entry.getKey(), entry.getValue());
           }
           else{
            hm22.put(entry.getKey(), entry.getValue());
           }
        }
        System.out.println(hm22);

    }
}

// Output:-

/*

{101=Vishal, 102=Komal, 103=aaa, 104=Abhishek, 105=Vijay}

*/

