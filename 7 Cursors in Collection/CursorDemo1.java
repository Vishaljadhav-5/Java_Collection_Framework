import java.util.ArrayList;

public class CursorDemo1 
{
    String name;
    int id;

    // Overriding the toString method of Object class
    public String toString()
    {
        return name + " , " + id ;
    }
    public static void main(String[] args) 
    {
        CursorDemo1 cd1 = new CursorDemo1();
        cd1.name = "Vishal";
        cd1.id = 101;

        System.out.println(cd1);              // CursorDemo1@5ecddf8f

        //----------------------------------------------

        ArrayList<Object> al1 = new ArrayList<>();

        al1.add("aaa");
        al1.add("bbb");
        al1.add("CCC");
        al1.add("ddd");

        System.out.println(al1);             // [aaa, bbb, CCC, ddd]
    }
}

//Output:-

// Vishal , 101
// [aaa, bbb, CCC, ddd]