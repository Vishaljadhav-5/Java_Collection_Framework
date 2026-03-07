import java.util.NavigableMap;
import java.util.TreeMap;

public class B_NavigableMapDemo1 
{
    public static void main(String[] args) 
    {
        NavigableMap<Object,Object> nm1 = new TreeMap<>();

        nm1.put(101, "Vishal");
        nm1.put(102, "Uday");
        nm1.put(103, "Komal");
        nm1.put(104, "Vijay");
        nm1.put(105, "Aadity");
        System.out.println(nm1);

        System.out.println("-----------------------");
        System.out.println("descendingMap() method : " + nm1.descendingMap());
        System.out.println("ceilingKey(-) method : " + nm1.ceilingKey(103));
        System.out.println("ceilingEntry(-) method : " + nm1.ceilingEntry(103));
        System.out.println("-----------------------");

        System.out.println("higherKey(-) method : " + nm1.higherKey(103));
        System.out.println("higherEntry(-) method : " + nm1.higherEntry(103));
        System.out.println("-----------------------");

        System.out.println("lowerKey(-) method : " + nm1.lowerKey(102));
        System.out.println("lowerEntry(-) method : " + nm1.lowerEntry(102));
        System.out.println("-----------------------");

        System.out.println("floorKey(-) method : " + nm1.floorKey(102));
        System.out.println("floorEntry(-) method : " + nm1.floorEntry(102));
        System.out.println("floorKey(-) method : " + nm1.floorKey(108));

    }
}

// Output:-

/*

{101=Vishal, 102=Uday, 103=Komal, 104=Vijay, 105=Aadity}
-----------------------
descendingMap() method : {105=Aadity, 104=Vijay, 103=Komal, 102=Uday, 101=Vishal}
ceilingKey(-) method : 103
ceilingEntry(-) method : 103=Komal
-----------------------
higherKey(-) method : 104
higherEntry(-) method : 104=Vijay
-----------------------
lowerKey(-) method : 101
lowerEntry(-) method : 101=Vishal
-----------------------
floorKey(-) method : 102
floorEntry(-) method : 102=Uday
floorKey(-) method : 105

*/