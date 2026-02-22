import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo4 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());

        ts.add(10);
        ts.add(40);
        ts.add(20);
        ts.add(30);

        System.out.println(ts); // [40, 30, 20, 10]
    }
}

//Output:-

/*
[40, 30, 20, 10]
*/