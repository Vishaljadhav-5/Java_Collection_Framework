

class A<T>  // T stands for type however we can give any name.
{
    T a;
    A(T a)
    {
        this.a = a;
    }

    void show()
    {
        System.out.println(a);
    }

}
public class B_Generics2 
{
    public static void main(String[] args) 
    {
        A<String> obj2 = new A<String>("aaa");
        obj2.show();

        A<Integer> obj22 = new A<Integer>(66);
        obj22.show();
    }
}
// Output:-

/*

aaa
66

*/