// Traversing a Deque


import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo4 {
    public static void main(String[] args) {

        Deque<String> dq4 = new ArrayDeque<>();

        dq4.add("A");
        dq4.add("B");
        dq4.add("C");

        for (String item : dq4) {
            System.out.println(item);
        }
    }
}

//Output:-

/*
A
B
C
*/