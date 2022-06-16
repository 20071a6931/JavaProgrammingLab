import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
    public static void main(String args[])throws FileNotFoundException
    {
          throw new FileNotFoundException();
//        FileInputStream file =new FileInputStream("D://file");
    }
}
