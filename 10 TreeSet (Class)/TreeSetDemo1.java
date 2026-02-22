import java.util.TreeSet;

public class TreeSetDemo1 
{

    public static void main(String[] args) 
    {
        
        TreeSet<Object> ts1 = new TreeSet<>();
        ts1.add("EEE");
        ts1.add("GGG");
        ts1.add("BBB");
        ts1.add("DDD");
        ts1.add("CCC");
        ts1.add("AAA");
        ts1.add("FFF");
       
        System.out.println("Elements are : " + ts1);
    }
}

//Output:-

/*
Elements are : [AAA, BBB, CCC, DDD, EEE, FFF, GGG]
*/