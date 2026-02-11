import java.util.ArrayList;

public class ArrayListDemo9 {
    public static void main(String[] args) {
        ArrayList<Object> al9 = new ArrayList<>();

        al9.add(10);
        al9.add(20);
        al9.add(25);
        al9.add(30);
        al9.add(40);
        al9.add("Visal");
        al9.add(20);

        System.out.println(al9);

        System.out.println("Get element from index : " + al9.get(4));
        // System.out.println("Get element from index : " + al9.get(10));

        System.out.println("set() method replace the element. ");
        al9.set(2, 100);
        System.out.println("After set:" + al9);

        System.out.println("Get index of element : "+ al9.indexOf(20));
        System.out.println("Get index of element from last : "+ al9.lastIndexOf(20));

    }
}

// Output:- 

// [10, 20, 25, 30, 40, Visal, 20]
// Get element from index : 40
// set() method replace the element. 
// After set:[10, 20, 100, 30, 40, Visal, 20]
// Get index of element : 1
// Get index of element from last : 6