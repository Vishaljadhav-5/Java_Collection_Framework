import java.util.Comparator;
import java.util.TreeMap;


class NameComparison implements Comparator<Object>
{

    @Override
    public int compare(Object o1, Object o2) 
    {
         Integer i1 = (Integer)o1;
         Integer i2 = (Integer)o2;
        // return i1.compareTo(i2);
        return -i1.compareTo(i2); // reverse order

        // String s1 = (String)o1; // need to make extra class
        // String s2 = (String)o2;

        // return s1.compareTo(s2);
    }
}
public class C_TreeMap2 
{
    public static void main(String[] args) 
    {
        TreeMap<Object,Object> tm2 = new TreeMap<>(new NameComparison());

        tm2.put(106, "Priya");
        tm2.put(101, "Vishal");
        tm2.put(102, "Uday");
        tm2.put(103, "Komal");
        tm2.put(104, "Vijay");
        tm2.put(105, "Aadity");
        

        System.out.println(tm2);
    }
}

// Output:-

/*

{106=Priya, 105=Aadity, 104=Vijay, 103=Komal, 102=Uday, 101=Vishal}

*/