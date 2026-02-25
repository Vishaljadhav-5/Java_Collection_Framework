//Traversing ArrayDeque

import java.util.ArrayDeque;

public class ArrayDequeDemo4 {
    public static void main(String[] args) {

        ArrayDeque<String> dq4 = new ArrayDeque<>();

        dq4.add("Java");
        dq4.add("Python");
        dq4.add("C++");

        for (String s : dq4) {
            System.out.println(s);
        }
    }
}
//Output:-

/*
Java
Python
C++
*/