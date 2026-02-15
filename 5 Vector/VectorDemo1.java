import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        System.out.println(v.capacity()); //10

        for(int i = 0; i <= 11; i++) {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println(v.capacity()); //20
    }
}

//Output:-

// 10
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
// 20