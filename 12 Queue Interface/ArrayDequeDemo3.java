//ArrayDeque as Queue (FIFO)

import java.util.ArrayDeque;

public class ArrayDequeDemo3 {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        queue.poll();
        System.out.println("After poll: " + queue);
    }
}

//Output:-

/*
Queue: [10, 20, 30]
After poll: [20, 30]
*/