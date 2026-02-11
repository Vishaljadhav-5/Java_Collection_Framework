//package 3_List(Interface)_And_ArrayList(Class);

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
       
        al.add(50);
        al.add(87);
        al.add(36);
        al.add("Vishal");

        // al.add(5,"Amit"); //java.lang.IndexOutOfBoundsException: Index: 5, Size: 4

        al.add(4,44);
        al.add(5,23);
        al.add(77);
        System.out.println(al);
    }
}

//output:-

//[50, 87, 36, Vishal, 44, 23, 77]