import java.util.ArrayList;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;

        System.out.println(arr); //[I@5ecddf8f

        System.out.println("THROUGH FOR EACH LOOP");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("THROUGH FOR LOOP");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
        System.out.println("===========================================");

        //------------------
        ArrayList<Object> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);

        System.out.println("THROUGH FOR EACH LOOP");
        for (Object object : al) {
            System.out.println(object);
        }

        System.out.println("THROUGH FOR LOOP");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}


//Output:- 

// [I@5ecddf8f
// THROUGH FOR EACH LOOP
// 10 20 30 40 50 60 
// THROUGH FOR LOOP
// 10 20 30 40 50 60
// ===========================================
// [10, 20, 30]
// THROUGH FOR EACH LOOP
// 10
// 20
// 30
// THROUGH FOR LOOP
// 10
// 20
// 30