public class ClonableInterfaceDemo implements Cloneable //Neccessary to implement Clonable
{

    int i;
    String str;

    
    public ClonableInterfaceDemo() {
        
    }

    public ClonableInterfaceDemo(int i , String str) {
        this.i = i;
        this.str = str;
    }


    public static void main(String[] args) throws CloneNotSupportedException // clone throws exception
    {
        ClonableInterfaceDemo ci1 = new ClonableInterfaceDemo(10,"Vishal");

        ClonableInterfaceDemo ci2 = (ClonableInterfaceDemo)ci1.clone();

        System.out.println(ci1.i +" "+  ci2.str); //10 Vishal
        System.out.println(ci2.i +" "+  ci2.str); //10 Vishal
        
    }
}
