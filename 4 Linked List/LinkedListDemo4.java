import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo4 {

    public static void main(String[] args) {

        ArrayList<Object> al3 = new ArrayList<>();

        al3.add(10);
        al3.add(20);
        al3.add(25);
        al3.add(30);
        al3.add(40);
        al3.add(20);

        LinkedList<Object> ll3 = new LinkedList<>(al3);
        ll3.add("Vishal");
        ll3.addFirst("Uday "); 
        
        System.out.println("Linked List Before Removal\n" + ll3);

        System.out.println();

        System.out.println("Getting first element is removed : " + ll3.getFirst());
        System.out.println("Getting last element is removed : " + ll3.getLast());


        System.out.println("Linked List After Removal\n" + ll3);
    }
}

//Output:-

// Linked List Before Removal
// [Uday , 10, Vishal, Ram, AAkash, 12, Ajay]

// Getting first element is removed : Uday 
// Getting last element is removed : Ajay
// Linked List After Removal
// [Uday , 10, Vishal, Ram, AAkash, 12, Ajay]