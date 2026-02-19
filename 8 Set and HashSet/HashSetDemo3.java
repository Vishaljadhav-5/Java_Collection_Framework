
import java.util.HashSet;

public class HashSetDemo3 
{
    public static void main(String[] args) 
    {
        // HashSet<Object> hs3 = new HashSet<>(5,.80f);

        HashSet<Object> hs3 = new HashSet<>();


        hs3.add("aaa");
        hs3.add("bbb");
        hs3.add(10);
        hs3.add("ccc");
        hs3.add("ddd");
        hs3.add("aaa"); //Can not added in hashset.

        System.out.println(hs3);
    }
}

//Output:-

//[aaa, ccc, bbb, ddd, 10]