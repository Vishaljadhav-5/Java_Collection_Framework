import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

    public static void main(String[] args) {
        
        System.out.println("LinkedHashSet Follows Insertion order: ");
        LinkedHashSet<Object> lhs1 = new LinkedHashSet<>();
        lhs1.add("aaa");
        lhs1.add("bbb");
        lhs1.add("ccc");
        lhs1.add("ddd");
        lhs1.add("eee");
        lhs1.add("fff");
        lhs1.addFirst("000");
        System.out.println(lhs1);

        System.out.println();

        System.out.println("HashSet does not Follow the insertion order: ");
        HashSet<Object> hs1 = new HashSet<>();
        hs1.add("aaa");
        hs1.add("bbb");
        hs1.add("ccc");
        hs1.add("ddd");
        hs1.add("eee");
        hs1.add("fff");
        System.out.println(hs1);

    }
}

// Output:-

// LinkedHashSet Follows Insertion order: 
// [000, aaa, bbb, ccc, ddd, eee, fff]

// HashSet does not Follow the insertion order:
// [aaa, ccc, bbb, eee, ddd, fff]