import java.util.NavigableMap;
import java.util.TreeMap;

public class B_NavigableMapDemo2 
{
    public static void main(String[] args) 
    {
        NavigableMap<Object,Object> nm2 = new TreeMap<>();

        nm2.put(101, "Vishal");
        nm2.put(102, "Uday");
        nm2.put(103, "Komal");
        nm2.put(104, "Vijay");
        nm2.put(105, "Aadity");
        System.out.println(nm2);

        System.out.println("-----------------------");
        System.out.println("pollFirstEntry() method : " + nm2.pollFirstEntry());
        System.out.println(nm2);

        System.out.println("-----------------------");
        System.out.println("polllastEntry() method : " + nm2.pollLastEntry());
        System.out.println(nm2);
    }
}

// Output:-

/*

{101=Vishal, 102=Uday, 103=Komal, 104=Vijay, 105=Aadity}
-----------------------
pollFirstEntry() method : 101=Vishal
{102=Uday, 103=Komal, 104=Vijay, 105=Aadity}
-----------------------
polllastEntry() method : 105=Aadity
{102=Uday, 103=Komal, 104=Vijay}

*/