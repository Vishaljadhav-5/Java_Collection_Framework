// Peek Elements in ArrayDeque

import java.util.ArrayDeque;

public class ArrayDequeDemo5 {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq5 = new ArrayDeque<>();

        dq5.add(100);
        dq5.add(200);
        dq5.add(300);

        System.out.println("First: " + dq5.peekFirst());
        System.out.println("Last: " + dq5.peekLast());
    }
}
//Output:-

/*
First: 100
Last: 300
*/