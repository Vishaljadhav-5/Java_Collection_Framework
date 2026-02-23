import java.util.TreeSet;

public class ComparableDemo1 {

    public static void main(String[] args) {
        
        TreeSet<Object> ts1 = new TreeSet<>();

        ts1.add("AAA");         // compareTo()
        ts1.add("ccc");
        ts1.add("ddd");
        ts1.add("bbb");
        ts1.add("eee");
        System.out.println(ts1);

        TreeSet<Object> ts11 = new TreeSet<>();

        ts11.add(10);           // compareTo()
        ts11.add(40);
        ts11.add(20);
        ts11.add(30);
        ts11.add(50);
        ts11.add(60);
        System.out.println(ts11);
    }
}

//Output:-

/*
[AAA, bbb, ccc, ddd, eee]
[10, 20, 30, 40, 50, 60]
*/