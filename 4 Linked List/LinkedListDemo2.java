import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {
        LinkedList<Object> ll2 = new LinkedList<>();
         

        ll2.add(10);
        ll2.add("Vishal");
        ll2.add("Ram");
        ll2.addFirst("Uday "); 
        ll2.addLast("AAkash"); 
        ll2.add( 12);
        ll2.add("Ajay"); 
        System.out.println("Linked List Before Removal\n" + ll2);

        System.out.println();

        System.out.println("This first element is removed : " + ll2.removeFirst());
        System.out.println("This last element is removed : " + ll2.removeLast());


        System.out.println("Linked List After Removal\n" + ll2);

        
    }
}

//Output:-

// Linked List Before Removal
// [Uday , 10, Vishal, Ram, AAkash, 12, Ajay]

// This first element is removed : Uday 
// This last element is removed : Ajay
// Linked List After Removal
// [10, Vishal, Ram, AAkash, 12]