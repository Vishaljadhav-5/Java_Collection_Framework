// ArrayDeque as Stack (LIFO)

import java.util.ArrayDeque;

public class ArrayDequeDemo2{
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack);

        stack.pop();
        System.out.println("After pop: " + stack);
    }
}
//Output:-

/*
Stack: [3, 2, 1]
After pop: [2, 1]
*/
