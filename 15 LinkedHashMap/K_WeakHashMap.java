import java.util.HashMap;
import java.util.WeakHashMap;

public class K_WeakHashMap 
{
    public static void main(String[] args) 
    {
        Integer i1 = new Integer(101);
        Integer i2 = new Integer(102);

        HashMap<Object,String> hm = new HashMap<>();
        hm.put(i1, "Vishal");
        hm.put(i2, "Uday");    

        i2 = null;
        System.gc();
        System.out.println(hm);

        System.out.println("--------------------------");

        Integer i3 = new Integer(101);
        Integer i4 = new Integer(102);

        WeakHashMap<Object,String> hm2 = new WeakHashMap();
        hm2.put(i3, "Vishal");
        hm2.put(i4, "Uday");    

        i4 = null;
        System.gc();
        System.out.println(hm2);
    }
}

// Output:-

/*

{101=Vishal, 102=Uday}
--------------------------
{101=Vishal}

*/
