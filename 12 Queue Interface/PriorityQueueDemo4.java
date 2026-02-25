// PriorityQueue with Custom Objects

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Lower priority value = higher importance
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (priority: " + priority + ")";
    }
}

public class PriorityQueueDemo4 {
    public static void main(String[] args) {
        PriorityQueue<Task> pq4 = new PriorityQueue<>();

        pq4.add(new Task("Write report", 2));
        pq4.add(new Task("Fix bugs", 1));
        pq4.add(new Task("Team meeting", 3));

        while (!pq4.isEmpty()) {
            System.out.println("Processing: " + pq4.poll());
        }
    }
}

// Output:-

/*
Processing: Fix bugs (priority: 1)
Processing: Write report (priority: 2)
Processing: Team meeting (priority: 3)
*/
