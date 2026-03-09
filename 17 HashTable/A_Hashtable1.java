import java.util.Hashtable;

public class A_Hashtable1 
{

    public static void main(String[] args)
    {
        Hashtable<Object,Object> ht1 = new Hashtable<>();
        ht1.put(101, "Vishal");
        ht1.put(102, "Nitish");
        ht1.put(103, "Sumit");
        ht1.put(104, "Abhishek");
        ht1.put(105, "Prafull");
        // ht1.put(null, "Komal"); //java.lang.NullPointerException:
        // ht1.put(107, null); // java.lang.NullPointerException

        System.out.println(ht1);
    }
}

// Output:-

/*

{105=Prafull, 104=Abhishek, 103=Sumit, 102=Nitish, 101=Vishal}

*/