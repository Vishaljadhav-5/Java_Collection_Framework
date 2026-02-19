import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo2 
{
    public static void main(String[] args) 
    {

        ArrayList<Object> al = new ArrayList<>();
        al.add("Krishna");
        al.add(200);

        HashSet<Object> hs2 = new HashSet<>(al);

        hs2.add("aaa");
        hs2.add("bbb");
        hs2.add(10);
        hs2.add("ccc");
        hs2.add("ddd");

        System.out.println(hs2);
    }
}
//Output:-

//[aaa, ccc, Krishna, bbb, ddd, 200, 10]