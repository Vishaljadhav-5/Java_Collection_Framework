//=> TASK : WAP to compare and add different elements according to length and alphabetical order
// For example :
// A, B, AA, BB, AAA, BBB, AAAA    

import java.util.Comparator;
import java.util.TreeSet;

class Order implements Comparator<Object>
{

    @Override
    public int compare(Object o1, Object o2) 
    {
        String s1 = o1.toString();
        String s2 = o2.toString();

        int len1  = s1.length();
        int len2  = s2.length();

        if(len1 > len2){
            return 1;
        }
        else if(len1 < len2){
            return -1;
        }
        else{
            return s1.compareTo(s2);
        }     
    }  
}

public class Task
{
    public static void main(String[] args) 
    {
        TreeSet<Object> tsk = new TreeSet<>(new Order());
        tsk.add("AAAA");
        tsk.add("BB");
        tsk.add("A");
        tsk.add("BBB");
        tsk.add("AAA");
        tsk.add("B");


        System.out.println(tsk);

    }
}

//Output:-

/*
[A, B, BB, AAA, BBB, AAAA]
*/
