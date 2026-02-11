import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Object> al3 = new ArrayList<>();    
    
        System.out.println(al3.add(10));
        System.out.println(al3.add(30)); 
        System.out.println(al3.add(50)); 
        System.out.println(al3.add(70)); 
        System.out.println(al3.add(90)); 

        al3.add(20);
        al3.add(30);
        al3.add(40);
        System.out.println(al3.add(null));

        System.out.println(al3);
    
    }
}

//Output:-

// true
// true
// true
// true
// true
// true
// [10, 30, 50, 70, 90, 20, 30, 40, null]
