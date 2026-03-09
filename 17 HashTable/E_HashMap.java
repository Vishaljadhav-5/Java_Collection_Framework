import java.util.HashMap;

public class E_HashMap {
    

    public static void main(String[] args)
    {
        HashMap<Object,Object> hm1 = new HashMap<>();
        hm1.put(101, "Vishal");
        hm1.put(105, "Nitish");
        hm1.put(104, "Sumit");
        hm1.put(102, "Abhishek");
        hm1.put(106, "Prafull");
        hm1.put(116, "Komal");


        System.out.println(hm1);
    }
}

// Output:-

/*

{116=Komal, 101=Vishal, 102=Abhishek, 104=Sumit, 105=Nitish, 106=Prafull}

*/