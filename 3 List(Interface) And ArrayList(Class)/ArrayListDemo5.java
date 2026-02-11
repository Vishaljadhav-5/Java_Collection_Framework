import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Object> al5 = new ArrayList<>();

        al5.add(10); // Storing as a object
        al5.add(10);
        al5.add(20);
        al5.add(25);
        al5.add(30);
        al5.add(40);

        ArrayList<Object> al55 = new ArrayList<>();
        al55.add(10);
        al55.add(20);

        //al5.removeAll(al55); //Remove objects like al55 present in al5
        al5.retainAll(al55); // take the element from al5 same element in all55
        //al5.clear();

        System.out.println(al5);
        System.out.println(al55);
    }
}

//Output:- 

// [10, 10, 20]
// [10, 20]
