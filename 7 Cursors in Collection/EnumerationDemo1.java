import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 
{
    public static void main(String[] args) 
    {
        Vector<Object> v1 = new Vector<>();
        v1.add("aaa");
        v1.add("bbb");
        v1.add("CCC");
        v1.add("ddd");


        //Through Enumeration we can print elements separately
        Enumeration<Object>  e1 = v1.elements();
        while (e1.hasMoreElements()) 
        {
            System.out.println(e1.nextElement());
        }
    }
}

//Output:-

// aaa
// bbb
// CCC
// ddd