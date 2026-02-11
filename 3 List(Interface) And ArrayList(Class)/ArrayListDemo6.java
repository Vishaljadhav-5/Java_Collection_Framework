import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Object> al6 = new ArrayList<>();

        al6.add(10);
        al6.add(20);
        al6.add(25);
        al6.add(30);
        al6.add(40);

        System.out.println(al6.contains(30));
        System.out.println(al6.contains(88));
        System.out.println(al6);

        ArrayList<Object> al66 = new ArrayList<>();

        al66.add(10);
        al66.add(20);

        System.out.println(al6.contains(al66)); //Checks whole arrayList is present or not.

        
    }
}

//Output:-

// true
// false
// [10, 20, 25, 30, 40]
// false
