
public class H_Compare
{
    public static void main(String[] args) 
    {
        int i1 = 10;
        int i2 = 20;
        System.out.println(i1 == i2);                   //true

        System.out.println("-------------------------------------");

        String str1 = "Uday";
        String str2 = "Uday";
        System.out.println(str1 == str2);               //true
        System.out.println(str1.equals(str2));          //true

        System.out.println("-------------------------------------");

        String str11 = new String("Vishal");      // false
        String str22 = new String("Vishal");     //true
        System.out.println(str11 == str22);
        System.out.println(str11.equals(str22));

    }
}


// Output:-

/*

false
-------------------------------------
true
true
-------------------------------------
false
true

*/