import java.util.TreeSet;

class Student2 implements Comparable<Object>
{
    int rollNo;
    String name;

    public Student2(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) 
    {
        Student2 st = (Student2)o;
        int i = this.name.compareTo(st.name);
        return i;
    }

    @Override
    public String toString() 
    {
        return rollNo + " - " + name;
    }  
}

public class ComparableDemo2 
{
    public static void main(String[] args) 
    {
        Student2 s1 = new Student2(101, "Vishal");
        Student2 s2 = new Student2(102, "Uday");
        Student2 s3 = new Student2(103, "Ritik");
        Student2 s4 = new Student2(104, "Shivam");
        Student2 s5 = new Student2(105, "Raj");

        TreeSet<Object> ts2 = new TreeSet<>();
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);
        ts2.add(s5);
        System.out.println(ts2);


    }
}

//Output:-

/*
[105 - Raj, 103 - Ritik, 104 - Shivam, 102 - Uday, 101 - Vishal]
*/
