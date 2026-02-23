import java.util.Comparator;
import java.util.TreeSet;

class Student4 
{
    int rollNo;
    String name;
    public Student4(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}


class SortByName implements Comparator<Object>  // class SortByName extends Object implements Comparator<Object>
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Student4 u1 = (Student4)o1;
        Student4 u2 = (Student4)o2;
        int i = u1.name.compareTo(u2.name);
        return i;
    }
}

class SortByRollNO implements Comparator<Object>  // class SortByRollNo extends Object implements Comparator<Object>
{

    @Override
    public int compare(Object o1, Object o2)
    {
        Student4 v1 = (Student4)o1;
        Student4 v2 = (Student4)o2;

        // return Integer.compare(v2.rollNo, v1.rollNo); // [105 - Raj, 104 - Shivam, 103 - Ritik, 102 - Uday, 101 - Vishal]
        return Integer.compare(v1.rollNo, v2.rollNo); //  [101 - Vishal, 102 - Uday, 103 - Ritik, 104 - Shivam, 105 - Raj]
    }
}

public class ComparatorDemo4 
{
    public static void main(String[] args) 
    {
        Student4 s1 = new Student4(101, "Vishal");
        Student4 s2 = new Student4(102, "Uday");
        Student4 s3 = new Student4(103, "Ritik");
        Student4 s4 = new Student4(104, "Shivam");
        Student4 s5 = new Student4(105, "Raj");

        TreeSet<Object> ts4 = new TreeSet<>(new SortByName());
        ts4.add(s1);
        ts4.add(s2);
        ts4.add(s3);
        ts4.add(s4);
        ts4.add(s5);
        System.out.println(ts4);

        TreeSet<Object> ts44 = new TreeSet<>(new SortByRollNO());
        ts44.add(s1);
        ts44.add(s2);
        ts44.add(s3);
        ts44.add(s4);
        ts44.add(s5);
        System.out.println(ts44);
    }
}

//Output:-

/*
[105 - Raj, 103 - Ritik, 104 - Shivam, 102 - Uday, 101 - Vishal]
[101 - Vishal, 102 - Uday, 103 - Ritik, 104 - Shivam, 105 - Raj]
*/