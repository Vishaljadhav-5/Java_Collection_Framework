import java.util.TreeSet;

class Sstudent2 implements Comparable<Object>
{
    int rollNo;
    String name;

    public Sstudent2(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) 
    {
        //Student2 st = (Student2)o;
        return 0;  // It return only one object
    }

    @Override
    public String toString() 
    {
        return rollNo + " - " + name;
    }  
}

public class CasesDemo2
{
    public static void main(String[] args) 
    {
        Sstudent2 s1 = new Sstudent2(101, "aaa");
        Sstudent2 s2 = new Sstudent2(102, "kkk");
        Sstudent2 s3 = new Sstudent2(103, "bbb");
        Sstudent2 s4 = new Sstudent2(104, "ddd");
        Sstudent2 s5 = new Sstudent2(105, "ccc");

        TreeSet<Object> tss2 = new TreeSet<>();
        tss2.add(s1);
        tss2.add(s2);
        tss2.add(s3);
        tss2.add(s4);
        tss2.add(s5);
        System.out.println(tss2);
    }
}

//Output:-

/*
[101 - aaa]
*/
