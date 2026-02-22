import java.util.TreeSet;

public class TreeSetDemo7 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(1);
        ts.add(3);

        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}

//Output:-

/*
1
3
5
*/
