import java.util.ArrayList;

public class B_Generics1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> IntAL =  new ArrayList<>();
        IntAL.add(10);
        IntAL.add(47);
        // IntAL.add("Vishal"); // By using generics we can acheive type safety.
        System.out.println(IntAL);

        ArrayList<String> StrAL = new ArrayList<>();
        StrAL.add("Vishal");
        StrAL.add("Uday");
        System.out.println(StrAL);

    }
}
// Output:-

/*

[10, 47]
[Vishal, Uday]

*/