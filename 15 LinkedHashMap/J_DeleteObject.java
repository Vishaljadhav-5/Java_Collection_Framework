

class A
{
    A(){
        System.out.println("Object is created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted...");
    }


}

public class J_DeleteObject
{
    public static void main(String[] args) 
    {
        A obj = new A();

        obj = null;
        System.gc();
    }
}

//Output:-

/*

Object is created.
Object deleted...

*/