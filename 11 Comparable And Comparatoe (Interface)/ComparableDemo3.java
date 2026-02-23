import java.util.TreeSet;

class Student3 implements Comparable<Object>
{
    int rollNo;
    String name;

    public Student3(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) 
    {
        Student3 st = (Student3)o;
        // Integer i1 = new Integer(this.rollNo);
        // Integer i2 = new Integer(st.rollNo);

        // if (i1>i2) {
        //     return -1;
        // }
        // else if (i2<i1) {
        //     return 1;
        // }
        // else{
        //     return 0;
        // }

        //return Integer.compare(this.rollNo, st.rollNo); // ascending //[101 - Vishal, 102 - Uday, 103 - Ritik, 104 - Shivam, 105 - Raj]
        return Integer.compare(st.rollNo, this.rollNo); // descending  //[105 - Raj, 104 - Shivam, 103 - Ritik, 102 - Uday, 101 - Vishal]
 
    }

    @Override
    public String toString() 
    {
        return rollNo + " - " + name;
    }  
}

public class ComparableDemo3 
{
    public static void main(String[] args) 
    {
        Student3 s1 = new Student3(101, "Vishal");
        Student3 s2 = new Student3(102, "Uday");
        Student3 s3 = new Student3(103, "Ritik");
        Student3 s4 = new Student3(104, "Shivam");
        Student3 s5 = new Student3(105, "Raj");

        TreeSet<Object> ts3 = new TreeSet<>();
        ts3.add(s1);
        ts3.add(s2);
        ts3.add(s3);
        ts3.add(s4);
        ts3.add(s5);
        System.out.println(ts3);

    }
}

//Output:-

/*
[105 - Raj, 104 - Shivam, 103 - Ritik, 102 - Uday, 101 - Vishal]
*/
