import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        
        Stack<Object> s1 = new Stack<>();

        s1.push("aaa");
        s1.push("bbb");
        s1.push("ccc");
        s1.push("ddd");
        s1.push("eee");

        System.out.println("Search Operation: " + s1.search("ccc"));
        System.out.println("Search Operation: " + s1.search("fff"));
        System.out.println(s1);

        System.out.println("----------------------------------------------");

        System.out.println("empty or not : " + s1.empty());

        System.out.println("----------------------------------------------");

        s1.clear();
        System.out.println("After clear empty() method: "+ s1.empty());
    }
}

// Output:-

// Search Operation: 3
// Search Operation: -1
// [aaa, bbb, ccc, ddd, eee]
// ----------------------------------------------
// empty or not : false
// ----------------------------------------------
// After clear empty() method: true
