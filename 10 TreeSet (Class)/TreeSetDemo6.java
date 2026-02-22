import java.util.TreeSet;

public class TreeSetDemo6 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(null); // ❌ NullPointerException
        ts.add(10);
    }
}

//Output:-

/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
*/