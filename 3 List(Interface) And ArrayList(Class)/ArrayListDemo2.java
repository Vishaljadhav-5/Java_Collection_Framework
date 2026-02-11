import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        
        ArrayList<Object> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);

        ArrayList<Object> al22 = new ArrayList<>();
        al22.add("Vishal");
        al22.add("Viraj");

        al2.add(al22);

        al2.add(2,al22);

        System.out.println(al2);
        System.out.println(al22);
    }
}

//Output:-

// [10, 20, [Vishal, Viraj], 30, 40, [Vishal, Viraj]]
// [Vishal, Viraj]
