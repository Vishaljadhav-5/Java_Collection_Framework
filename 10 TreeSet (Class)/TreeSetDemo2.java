import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(10); // duplicate
        ts.add(30);

        System.out.println(ts); // [10, 20, 30]
    }
}

//Output:-

/*
[10, 20, 30]
*/