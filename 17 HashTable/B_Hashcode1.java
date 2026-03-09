
public class B_Hashcode1 
{
    public static void main(String[] args) 
    {
        B_Hashcode1 h1 = new B_Hashcode1();
        System.out.println(h1.hashCode());

        B_Hashcode1 h2 = new B_Hashcode1();
        System.out.println(h2.hashCode());

        // Integer i = new Integer(101);
        // System.out.println(i.hashCode());

        String str = new String();
        System.out.println(str.hashCode());
        
        
        String str2 = new String("Aman");
        System.out.println(str2.hashCode());
    }
}

// Output:-

/*

617901222
1159190947
0
2044281

*/
