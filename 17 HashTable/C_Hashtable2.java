import java.util.Hashtable;

public class C_Hashtable2 {
    

    public static void main(String[] args)
    {
        Hashtable<Object,Object> ht1 = new Hashtable<>();
        ht1.put(101, "Vishal");
        ht1.put(105, "Nitish");
        ht1.put(104, "Sumit");
        ht1.put(102, "Abhishek");
        ht1.put(106, "Prafull");
        ht1.put(116, "Komal");


        System.out.println(ht1);
    }
}

// Output:-

/*

{106=Prafull, 116=Komal, 105=Nitish, 104=Sumit, 102=Abhishek, 101=Vishal}

*/