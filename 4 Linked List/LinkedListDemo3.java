import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {
        LinkedList<Object> ll3 = new LinkedList<>();
         

        ll3.add(10);
        ll3.add("Vishal");
        ll3.add("Ram");
        ll3.addFirst("Uday "); 
        ll3.addLast("AAkash"); 
        ll3.add( 12);
        ll3.add("Ajay"); 
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