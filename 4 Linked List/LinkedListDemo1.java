import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {
        LinkedList<Object> ll1 = new LinkedList<>();
        ll1.add(10);
        ll1.add("Vishal");
        ll1.add("Ram");

        ll1.addFirst("Uday "); // Add at first position
        ll1.addLast("AAkash"); // Add at last position
        // ll1.add(6, 12);


        // ll1.add(8, "Ajay");  // java.lang.IndexOutOfBoundsException: Index: 8, Size: 4
        System.out.println(ll1);
    }
}

//Output:-

//[Uday , 10, Vishal, Ram, AAkash]
