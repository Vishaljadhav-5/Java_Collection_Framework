
// We can bound the generics

class AA<T extends Number>  // T stands for type however we can give any name.
{
    T a;

    AA(){  }

    AA(T a)
    {
        this.a = a;
    }

    void show(T a)
    {
        System.out.println(a);
    }

}
public class B_Generics3 
{
    public static void main(String[] args) 
    {
        // AA<String> obj3 = new AA<String>("aaa"); // Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number>
        

        AA<Integer> obj33 = new AA<Integer>();
        obj33.show(66);

        AA<Float> obj333 = new AA<Float>();
        obj333.show(44.5f);
    }
}
// Output:-

/*

66
44.5

*/