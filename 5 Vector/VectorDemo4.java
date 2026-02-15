import java.util.Vector;

public class VectorDemo4 {
    public static void main(String[] args) {
        Vector<Object> v4 = new Vector<>(8,2);
        System.out.println(v4.capacity()); //10

        for(int i = 0; i < 10; i++) {
            v4.addElement(i);
        }

        System.out.println(v4.firstElement()); //0
        System.out.println(v4.lastElement()); //9
        System.out.println(v4.removeElement(5)); //ture

        System.out.println(v4);

        v4.removeAllElements();
        System.out.println(v4);
    }
}

//Output:-

// 8
// 0
// 9
// true
// [0, 1, 2, 3, 4, 6, 7, 8, 9]
// []
