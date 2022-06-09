import java.io.FileInputStream;

public class CheckedException {
    public static void main(String args[]){

        try
        {
            FileInputStream file=new FileInputStream("D://folder");
        }
        catch (Exception e)
        {
            System.out.println("compile time exception occurred");
        }
    }
}

