package Introduction_Collection_Framework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CFDemo {
    public static void main(String[] args) {
        int a = 10, b=20, c=30;
        int sum = a + b + c;
        System.out.println("The sum of a, b and c is: " + sum);

        //----------------------------------------------------

        int[] arr = {10, 20, 30,40,50};
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }

        System.out.println("The sum of the array elements is: " + sumArr);

        //----------------------------------------------------

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("Vishal");
        al.add(new CFDemo());

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        al.clone();
    }
}

// Output:

// The sum of a, b and c is: 60
// The sum of the array elements is: 150
// 10
// 20
// 30
// Vishal
// Introduction_Collection_Framework.CFDemo@15db9742

