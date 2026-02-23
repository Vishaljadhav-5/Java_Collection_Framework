import java.util.TreeSet;

class Sstudent3 implements Comparable<Object>
{
    int rollNo;
    String name;

    public Sstudent3(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) 
    {
        //Student2 st = (Student2)o;
        return -1;  // It return output in stack form which means it produce first which inserted at end.
    }

    @Override
    public String toString() 
    {
        return rollNo + " - " + name;
    }  
}

public class CasesDemo3
{
    public static void main(String[] args) 
    {
        Sstudent3 s1 = new Sstudent3(101, "aaa");
        Sstudent3 s2 = new Sstudent3(102, "kkk");
        Sstudent3 s3 = new Sstudent3(103, "bbb");
        Sstudent3 s4 = new Sstudent3(104, "ddd");
        Sstudent3 s5 = new Sstudent3(105, "ccc");

        TreeSet<Object> tss3 = new TreeSet<>();
        tss3.add(s1);
        tss3.add(s2);
        tss3.add(s3);
        tss3.add(s4);
        tss3.add(s5);
        System.out.println(tss3);
    }
}

//Output:-

/*
[105 - ccc, 104 - ddd, 103 - bbb, 102 - kkk, 101 - aaa]
*/
