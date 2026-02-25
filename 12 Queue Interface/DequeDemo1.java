// Basic Deque Operations (Add, Remove, Display)

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo1 {
    public static void main(String[] args) {

        Deque<Integer> dq1 = new ArrayDeque<>();

        dq1.addFirst(10);
        dq1.addLast(20);
        dq1.addFirst(5);
        dq1.addLast(30);

        System.out.println("Deque: " + dq1);

        dq1.removeFirst();
        dq1.removeLast();

        System.out.println("After removal: " + dq1);
    }
}

//Output:-

/*
Deque: [5, 10, 20, 30]
After removal: [10, 20]
*/