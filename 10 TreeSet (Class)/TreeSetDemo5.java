import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);

        System.out.println("first() method : " + ts.first());   // 10
        System.out.println("last() method : " + ts.last());     // 50
        System.out.println("higher(-) method = Higher than 20: " + ts.higher(20)); // 30
        System.out.println("lower(-) method = Lower than 30: " + ts.lower(30));   // 20
    }
}

//Output:-

/*
first() method : 10
last() method : 50
higher(-) method = Higher than 20: 30
lower(-) method = Lower than 30: 20
*/