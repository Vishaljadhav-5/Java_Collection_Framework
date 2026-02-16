import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {
        
        Stack<Object> s1 = new Stack<>();

        s1.push("aaa");
        s1.push("bbb");
        s1.push("ccc");
        s1.push("ddd");
        s1.push("eee");

        System.out.println(s1);
        System.out.println("Peek Operation: " + s1.peek());
        System.out.println(s1);


        System.out.println("----------------------------");

        System.out.println("Pop Operation: " + s1.pop());
        System.out.println(s1);
    }
}

//Output:-

// [aaa, bbb, ccc, ddd, eee]
// Peek Operation: eee
// [aaa, bbb, ccc, ddd, eee]
// ----------------------------
// Pop Operation: eee
// [aaa, bbb, ccc, ddd]