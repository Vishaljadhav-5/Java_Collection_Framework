import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<Object> al8 = new ArrayList<>();

        al8.add(10);
        al8.add(20);
        al8.add(25);
        al8.add(30);
        al8.add(40);
        al8.add("Visal");

        System.out.println(al8);

        System.out.println("Size of al8: " + al8.size());
        System.out.println();

        System.out.println("toArray Method convert array list into an array.");
        Object [] obj = al8.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
        }
    }
}

//Output:-

// 10, 20, 25, 30, 40, Visal]
// Size of al8: 6

// toArray Method convert array list into an array.
// 10 20 25 30 40 Visal
