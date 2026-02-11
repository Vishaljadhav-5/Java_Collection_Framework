import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) 
    {
        ArrayList<Object> al4 = new ArrayList<>();

        al4.add(10); // Storing as a object
        al4.add(10);
        al4.add(20);
        al4.add("Vishal");
        al4.add(30);
        al4.add(40);
        
        System.out.println(al4);
        //Removing
        //al4.remove(10); //java.lang.IndexOutOfBoundsException: Index 10 out of bounds for length 5
        al4.remove("Vishal");
        al4.removeAll(al4);

        System.out.println(al4);
    }
}

//Output:-

// [10, 10, 20, Vishal, 30, 40]
// []
