import java.util.PriorityQueue;

public class PriorityQueueDemo1 
{
    public static void main(String[] args) {
        PriorityQueue<Object> pq1 = new PriorityQueue<>();

        pq1.add("aaa");
        pq1.offer("AAA"); // Prefered
        pq1.offer("BBB");
        pq1.offer("CCC");
        pq1.offer("DDD");
        pq1.offer("EEE");
        pq1.offer("FFF");

        System.out.println(pq1);

        System.out.println("Peek method: " + pq1.peek());
        System.out.println(pq1);

        System.out.println("-------------------------------");

        System.out.println("element method: "+pq1.element());
        System.out.println(pq1);

        System.out.println("-------------------------------");

        System.out.println("Poll method: "+pq1.poll());
        System.out.println(pq1);

        System.out.println("-------------------------------");

        System.out.println("Remove method: "+pq1.remove());
        System.out.println(pq1);
    }
}

// Output:-

/*
[AAA, CCC, BBB, aaa, DDD, EEE, FFF]
Peek method: AAA
[AAA, CCC, BBB, aaa, DDD, EEE, FFF]
-------------------------------
element method: AAA
[AAA, CCC, BBB, aaa, DDD, EEE, FFF]
-------------------------------
Poll method: AAA
[BBB, CCC, EEE, aaa, DDD, FFF]
-------------------------------
Remove method: BBB
[CCC, DDD, EEE, aaa, FFF]
*/
