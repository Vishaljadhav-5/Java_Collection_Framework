import java.io.FileInputStream;
import java.util.Properties;

public class A_Properties1 
{

    public static void main(String[] args) throws Exception
    {
        Properties p1 = new Properties();

        FileInputStream fis1 = new FileInputStream("F:\\SP Core Java\\Code\\14 Collection Framework\\18 Dictionary, Properties and Concurrent Collections\\Xyz.properties");

        p1.load(fis1);

        System.out.println(p1);
        System.out.println(p1.get("name_validation"));
        System.out.println(p1.get("email_validation"));
    }
}

// Output:-

/*

{name_validation=Name is Invalid, email_validation=Email is Invalid}
Name is Invalid
Email is Invalid

*/