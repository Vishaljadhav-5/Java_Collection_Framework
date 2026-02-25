import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        // Default PriorityQueue (min-heap)
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        // Adding elements
        pq2.add(10);
        pq2.add(5);
        pq2.add(20);

        // Printing elements (not sorted order, but heap structure)
        System.out.println("PriorityQueue: " + pq2);

        // Removing elements (smallest first)
        while (!pq2.isEmpty()) {
            System.out.println("Removed: " + pq2.poll());
        }
    }
}

// Output:-

/*
PriorityQueue: [5, 10, 20]
Removed: 5
Removed: 10
Removed: 20
*/

