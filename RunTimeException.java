public class RunTimeException {
    public static void main(String args[]){
        int a,b;
        try
        {
            a=6;
            b=a/0;
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception occurred");
            System.out.println("after exception");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
