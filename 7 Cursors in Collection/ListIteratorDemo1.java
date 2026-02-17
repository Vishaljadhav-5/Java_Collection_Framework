import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo1 
{
    public static void main(String[] args) 
    {
        ArrayList<Object> al2 = new ArrayList<>();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("CCC");
        al2.add("ddd");

        //-------------------------------------------------------

        ListIterator<Object> li1 =  al2.listIterator();

        //Print in forward direction:-
        System.out.println("Print in forward direction:- ");
        while (li1.hasNext()) 
        {
            System.out.println(li1.next());
        }

        System.out.println("--------------------------------------------------");

        //Print in backward direction:-
        System.out.println("Print in backward direction:-");
        while (li1.hasPrevious()) 
        {
            System.out.println(li1.previous());
        }
    }
}

//Output:-

// Print in forward direction:- 
// aaa
// bbb
// CCC
// ddd
// --------------------------------------------------
// Print in backward direction:-
// ddd
// CCC
// bbb
// aaa
