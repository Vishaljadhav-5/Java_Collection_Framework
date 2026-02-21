import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo2 
{
    public static void main(String[] args) 
    {
        SortedSet<Object> ss2 = new TreeSet<>();
        ss2.add("aaa");
        ss2.add("bbb");
        ss2.add("ccc");
        ss2.add("ddd");
        ss2.add("eee");
        ss2.add("fff");
        System.out.println(ss2);

        System.out.println("first() method: " + ss2.first());
        System.out.println("last() method: " + ss2.last());
        System.out.println("headSet() method: " + ss2.headSet("ccc")); // return all elements before ccc
        System.out.println("tailSet() method: " + ss2.tailSet("ddd")); // return all elements after ddd including itself.
        System.err.println("subSet(-,-) method: "+ ss2.subSet("bbb", "eee")); //return between elements.

    }
}


//Output:-

/*

[aaa, bbb, ccc, ddd, eee, fff]
first() method: aaa
last() method: fff
headSet() method: [aaa, bbb]
tailSet() method: [ddd, eee, fff]
subSet(-,-) method: [bbb, ccc, ddd]

*/
