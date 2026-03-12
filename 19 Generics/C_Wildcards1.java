import java.util.ArrayList;

class AAA
{
    void show(ArrayList<?> al)
    {
        System.out.println(al);
    }
}


public class C_Wildcards1 
{
    public static void main(String[] args) 
    {
        AAA a1 = new AAA();

        ArrayList<String> al = new ArrayList<String>();
        al.add("zzz");
        al.add("www");

        a1.show(al);

        ArrayList<Integer> all = new ArrayList<Integer>();
        all.add(45);
        all.add(64);

        a1.show(all);
    }    
}

// Output:-

/*

[zzz, www]
[45, 64]

*/