// Peek Operations (Without Removing)

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo5 {
    public static void main(String[] args) {

        Deque<Integer> dq5 = new ArrayDeque<>();

        dq5.add(100);
        dq5.add(200);
        dq5.add(300);

        System.out.println("First: " + dq5.peekFirst());
        System.out.println("Last: " + dq5.peekLast());
        System.out.println("Deque: " + dq5);
    }
}
//Output:-

/*
First: 100
Last: 300
Deque: [100, 200, 300]
*/