
class A
{
    int i;

    A(int i)
    {
        this.i = i;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return i;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return i + "";
    }
}

public class D_Hashcode2 
{
    public static void main(String[] args) 
    {
        A a1 = new A(1);
        System.out.println(a1.hashCode());

        A a2 = new A(2);
        System.out.println(a2.hashCode());
    }
     
}

// Output:-

/*

1
2

*/