import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 
{
    public static void main(String[] args) 
    {
        Set<Object> s1 = new HashSet<>();

        s1.add("Vishal");
        s1.add("bbb");
        s1.add(10);
        s1.add("ccc");
        s1.add("ddd");

        System.out.println(s1);

    }
}

//Output 

//[ccc, bbb, ddd, 10, Vishal]