
// To make a methods syncronize.

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo5 
{
    public static void main(String[] args) 
    {
         HashMap<Object,Object> hm5 = new HashMap<>();
         Map<Object,Object> map = Collections.synchronizedMap(hm5);

         HashMap<Object,Object> hm55 = new HashMap<>(map); // All the methods of hm55 is working in syncrinized way.

    }
}
