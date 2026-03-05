import java.util.HashMap;
import java.util.IdentityHashMap;

public class I_IdentityHashMap
{
    public static void main(String[] args) 
    {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        HashMap<Object,String> hm = new HashMap<>();
        hm.put(i1, "Vishal");
        hm.put(i2, "Uday");     // i1.equals(i2)  -> true 
        System.out.println(hm);

        IdentityHashMap<Object,String> ihm = new IdentityHashMap<>();
        ihm.put(i1, "Vishal");
        ihm.put(i2, "Uday");   // i1==i2 -> false
        System.out.println(ihm);
    }
}
    
// Output:-

/*

{100=Uday}
{100=Uday, 100=Vishal}

*/
