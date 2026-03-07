import java.util.TreeMap;

public class C_TreeMap1 
{
    public static void main(String[] args) 
    {
        TreeMap<Object,Object> tm1 = new TreeMap<>();

        tm1.put(106, "Priya");
        tm1.put(101, "Vishal");
        tm1.put(102, "Uday");
        tm1.put(103, "Komal");
        tm1.put(104, "Vijay");
        tm1.put(105, "Aadity");
        // tm1.put("ABC", "aaa"); // java.lang.ClassCastException:
        // tm1.put(null, "aaa"); // java.lang.NullPointerException

        tm1.put(102, "Abhishek"); // Replace the value.

        System.out.println(tm1);
    }
}

// Output:-

/*

{101=Vishal, 102=Abhishek, 103=Komal, 104=Vijay, 105=Aadity, 106=Priya}

*/