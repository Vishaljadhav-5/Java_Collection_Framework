import java.util.ArrayList;

public class A_ProblemWithoutGenerics
{
    public static void main(String[] args) 
    {
        String [] str  = new String[3];
        str[0] = "Vishal";
        //str[1] = 20; // WE cannot store diff type of element-type safety is present in array.
        str[1] = "Komal";
        str[2] = "Shubham";

        String name = str[0];
        System.out.println(name);


        System.out.println("-------------------------------");

        ArrayList<Object> al1 = new ArrayList<>();
        al1.add("Ram");
        al1.add(10);
        al1.add(10.4f); // Not type safe

        String name1 = (String)al1.get(0); // need casting when we want to retrive th data.
        System.out.println(name1);
    }
}

// Output:-

/*

Vishal
-------------------------------
Ram

*/
