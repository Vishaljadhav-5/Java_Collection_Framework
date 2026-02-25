// Basic ArrayDeque Program (Add & Remove)

import java.util.ArrayDeque;

public class ArrayDequeDemo1 {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq1 = new ArrayDeque<>();

        dq1.add(10);
        dq1.add(20);
        dq1.addFirst(5);
        dq1.addLast(30);

        System.out.println("ArrayDeque: " + dq1);

        dq1.removeFirst();
        dq1.removeLast();

        System.out.println("After removal: " + dq1);
    }
}
//Output:-

/*
ArrayDeque: [5, 10, 20, 30]
After removal: [10, 20]
*/