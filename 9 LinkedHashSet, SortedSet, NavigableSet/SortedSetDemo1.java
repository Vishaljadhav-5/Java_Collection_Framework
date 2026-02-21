import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 
{
    public static void main(String[] args) 
    {
        SortedSet<Object> ss = new TreeSet<>();
        ss.add(10);
        ss.add(20);
        ss.add(40);
        ss.add(50);
        ss.add(30);

        System.out.println(ss);

        SortedSet<Object> ss1 = new TreeSet<>();
        ss1.add("aaa");
        ss1.add("ccc");
        ss1.add("fff");
        ss1.add("bbb");
        // ss1.add(new StringBuffer("ddd")); //java.lang.ClassCastException beacuse StringBuffer does not implements comparable implements.

        System.out.println(ss1);

    }
}
