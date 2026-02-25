
import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        // Max-Heap using reverse order
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Collections.reverseOrder());

        pq3.add(10);
        pq3.add(5);
        pq3.add(20);

        while (!pq3.isEmpty()) {
            System.out.println("Removed: " + pq3.poll());
        }
    }
}

// Output:-

/*
Removed: 20
Removed: 10
Removed: 5
*/
