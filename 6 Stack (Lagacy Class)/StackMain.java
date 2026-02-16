public class StackMain {

    void m1()
    {
        System.out.println("I am in m1 method.");
        m3();
        System.out.println("m1");
    }

    void m2()
    {
        System.out.println("I am in m2 method.");
        m1();
        System.out.println("m2");
    }

    void m3()
    {
        System.out.println("I am in m3 method.");
        System.out.println("m3");
    }
    public static void main(String[] args) {
        StackMain sm = new StackMain();
        sm.m2();
    }
}

//Output:-

// I am in m2 method.
// I am in m1 method.
// I am in m3 method.
// m3
// m1
// m2
