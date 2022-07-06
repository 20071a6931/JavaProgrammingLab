interface i
{
    void hey();
}
class Abc implements Runnable, i
{
    public void run()
    {
        try
        {
            for (int i=0; i<4; i++)
            {
                Thread.sleep(1000);
                System.out.println("hai");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void hey()
    {
        System.out.println("hey");
    }
}
class Def implements Runnable
{
    public void run()
    {
        try
        {
            for (int i=0; i<4; i++)
            {
                Thread.sleep(1000);
                System.out.println("hello");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ThreadUsingInterface {
    public static void main(String args[])
    {
        Abc a=new Abc();
        Def d=new Def();
        Thread t1=new Thread(a);
        Thread t2=new Thread(d);
        t1.start();
        a.hey();
        t2.start();
    }
}
