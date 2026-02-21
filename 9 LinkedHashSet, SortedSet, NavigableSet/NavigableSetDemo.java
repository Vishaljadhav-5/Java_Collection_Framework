import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {
        
        NavigableSet<Object> ns1 = new TreeSet<>();

        ns1.add("aaa");
        ns1.add("bbb");
        ns1.add("ccc");
        ns1.add("ddd");
        ns1.add("eee");
        ns1.add("fff");

        System.out.println("Methods of NavigableSet: ");

        System.out.println("descendingSet() method: " + ns1.descendingSet()); //Provide in descending order
        System.out.println("ceiling() method: " + ns1.ceiling("ccc")); // check itself or higher value
        System.out.println("higher() method: " + ns1.higher("ddd")); // CHecks only higher value
        System.out.println("floor() method: " + ns1.floor("bbb")); 
        System.out.println("lower() method: " + ns1.lower("ccc")); //provides lower value
        System.out.println("pollFirst() method: " + ns1.pollFirst());
        System.out.println("pollLast() method: " + ns1.pollLast());
    }
}

// Output:-

/*
Methods of NavigableSet: 
descendingSet() method: [fff, eee, ddd, ccc, bbb, aaa]
ceiling() method: ccc
higher() method: eee
floor() method: bbb
lower() method: bbb
pollFirst() method: aaa
pollLast() method: fff
*/