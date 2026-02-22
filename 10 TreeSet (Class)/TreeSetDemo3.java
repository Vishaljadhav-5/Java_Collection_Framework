import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Banana");
        ts.add("Apple");
        ts.add("Mango");
        ts.add("Grapes");

        System.out.println(ts);
    }
}

//Output:-

/*
[Apple, Banana, Grapes, Mango]
*/