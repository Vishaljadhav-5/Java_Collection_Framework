import java.io.FileInputStream;
import java.util.Properties;

public class B_PropertiesRealWorld 
{
    public static void main(String[] args) throws Exception
    {

        Properties p2 = new Properties();

        FileInputStream fis2 = new FileInputStream("F:\\SP Core Java\\Code\\14 Collection Framework\\18 Dictionary, Properties and Concurrent Collections\\Xyz.properties");

        p2.load(fis2);
        
        String name ="";
        String email = "vishal@gamil.com";

        if (name.equals("")) 
        {
            System.out.println(p2.get("name_validation")); 
            // If we change in file then here the content also change 
            // and we can run this program without recompiling.
        }
        else if (email.equals("")) 
        {
            System.out.println("Name is invalid!");
        }
        else
        {
            System.out.println("Valid");
        }
    }
}

// Output:-

/*

Name is Invalid !!!

*/