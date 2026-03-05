import java.util.HashMap;

public class A_HashMapDemo 
{

    public static void main(String[] args) 
    {
        HashMap<Object,Object> hm1 = new HashMap<>();
        hm1.put(101, "Vishal");
        hm1.put(102, "Rajput");
        hm1.put(103, "Uday");
        hm1.put(104, "Abhishek");
        hm1.put(105, "Vijay");

        System.out.println(hm1);
        System.out.println("size() method : " + hm1.size());
        System.out.println("get(-) method : "+hm1.get(103));
        System.out.println("remove(-) method : " + hm1.remove(104));
        System.out.println("containsKey(-) method : "+ hm1.containsKey(105));
        System.out.println("containsValue(-) method : "+ hm1.containsValue("Vishal"));

        System.out.println("-----------------------------");

        System.out.println("keySet() method : "+ hm1.keySet());
        System.out.println("values() method : "+ hm1.values());



        hm1.clear();

        System.out.println(hm1);

    }
}

// Output:-

/*

{101=Vishal, 102=Rajput, 103=Uday, 104=Abhishek, 105=Vijay}
size() method : 5
get(-) method : Uday
remove(-) method : Abhishek
containsKey(-) method : true
containsValue(-) method : true
-----------------------------
keySet() method : [101, 102, 103, 105]
values() method : [Vishal, Rajput, Uday, Vijay]
{}

*/