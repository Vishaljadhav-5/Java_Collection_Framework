import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<Object> al7 = new ArrayList<>();

        al7.add(10);
        al7.add(20);
        al7.add(25);
        al7.add(30);
        al7.add(40);
        al7.add("Visal");

        System.out.println(al7);

        System.out.println("Before Clear: " + al7.isEmpty());

        al7.clear();

        System.out.println("After Clear: " + al7.isEmpty());
    }
}

//Output:-

// [10, 20, 25, 30, 40, Visal]
// Before Clear: false
// After Clear: true
