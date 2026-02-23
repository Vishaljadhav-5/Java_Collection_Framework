import java.util.TreeSet;

class Sstudent1 implements Comparable<Object>
{
    int rollNo;
    String name;

    public Sstudent1(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) 
    {
        //Student2 st = (Student2)o;
        return 1;  // It followed the insertion order
    }

    @Override
    public String toString() 
    {
        return rollNo + " - " + name;
    }  
}

public class CasesDemo1
{
    public static void main(String[] args) 
    {
        Sstudent1 s1 = new Sstudent1(101, "aaa");
        Sstudent1 s2 = new Sstudent1(102, "kkk");
        Sstudent1 s3 = new Sstudent1(103, "bbb");
        Sstudent1 s4 = new Sstudent1(104, "ddd");
        Sstudent1 s5 = new Sstudent1(105, "ccc");

        TreeSet<Object> tss1 = new TreeSet<>();
        tss1.add(s1);
        tss1.add(s2);
        tss1.add(s3);
        tss1.add(s4);
        tss1.add(s5);
        System.out.println(tss1);


    }
}

//Output:-

/*
[101 - aaa, 102 - kkk, 103 - bbb, 104 - ddd, 105 - ccc]
*/
