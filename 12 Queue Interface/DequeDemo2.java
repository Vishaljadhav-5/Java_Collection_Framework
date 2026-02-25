
// Deque as a Stack (LIFO)
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo2 {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);
    }
}
//Output:-

/*
Stack: [30, 20, 10]
Popped: 30
After pop: [20, 10]
*/