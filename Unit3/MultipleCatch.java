public class MultipleCatch {
    public static void main(String args[])
    {
        try
        {
//            int a=6/0;
            String s="Hi";
            System.out.println(s.charAt(6));
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception occurred");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer assigned");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("String index out of bounds");
        }
        catch (Exception e)
        {
            System.out.println("default exception handler");
        }
    }
}
