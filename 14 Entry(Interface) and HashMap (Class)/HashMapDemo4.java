import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4
{
    public static void main(String[] args) 
    {
        HashMap<String,String> hm4 = new HashMap<>();
        hm4.put("101", "Vishal");
        hm4.put("102", "Komal");
        hm4.put("103", "Uday");
        hm4.put("104", "Abhishek");
        hm4.put("105", "Vijay");

        for (Map.Entry me : hm4.entrySet()) 
        {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

    }
}

// Output:-

/*

101 : Vishal
102 : Komal
103 : Uday
104 : Abhishek
105 : Vijay

*/

