public class TryCatch {
    public static void main(String args[])
    {
        try
        {
            int a=6/0;
        }
        catch (Exception exception)
        {
            System.out.println("exception handled");
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
