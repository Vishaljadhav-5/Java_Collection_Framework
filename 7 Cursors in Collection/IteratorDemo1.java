import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 
{
    public static void main(String[] args) 
    {
        ArrayList<Object> al1 = new ArrayList<>();
        al1.add("aaa");
        al1.add("bbb");
        al1.add("CCC");
        al1.add("ddd");

        Iterator<Object> itr1 = al1.iterator();

        while (itr1.hasNext()) 
        {
            String element = (String) itr1.next();
            System.out.println(element);

            if (element.equals("bbb")) 
            {
                itr1.remove(); 
                System.out.println("Element removed successfully.");
            }
        }

        System.out.println("Final Collection: " + al1);
    }
}

//Output:-

// aaa
// bbb
// Element removed successfully.
// CCC
// ddd
// Final Collection: [aaa, CCC, ddd]
