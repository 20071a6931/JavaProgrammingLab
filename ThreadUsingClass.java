class Sample1 extends Thread
{
    public void run()
    {
        try
        {
            for (int i=0;i<4;i++)
            {
                Thread.sleep(1000);
                System.out.println("DAA");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Sample2 extends Thread
{
    public void run()
    {
        try
        {
            for (int i=0;i<4;i++)
            {
                Thread.sleep(1000);
                System.out.println("JAVA");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


public class ThreadUsingClass {
    public static void main(String args[]){
        Sample1 s1=new Sample1();
        Sample2 s2=new Sample2();
        s1.start();
        s2.start();
    }
}
