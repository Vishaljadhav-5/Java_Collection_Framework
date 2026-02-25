// Deque as a Queue (FIFO)

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo3 {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        System.out.println("Removed: " + queue.poll());
        System.out.println("After removal: " + queue);
    }
}

//Output:-

/*
Queue: [10, 20, 30]
Removed: 10
After removal: [20, 30]
*/