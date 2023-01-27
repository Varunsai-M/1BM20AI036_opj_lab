import java.util.*;
import java.util.Random;

class primethreadR implements Runnable{
    int number;
    primethreadR(int x)
    {
        this.number = x;
    }
    public void run()
    {
        System.out.println("Primethread is executing");
        int flag = 0;
        for(int i=2;i< number/2;i++)
        {
            if(number%1 == 0)
            {
                System.out.println("Number"+number+"is not a prime no");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Number"+number+"is a prime no");
        }
    }
}
class primethreadT extends Thread
{
    int number;
    primethreadT(int x)
    {
        this.number = x;
    }
    public void run()
    {
        System.out.println("Primethread is executing");
        int flag = 0;
        for(int i=2;i< number/2;i++)
        {
            if(number%1 == 0)
            {
                System.out.println("Number"+number+"is not a prime no");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Number"+number+"is a prime no");
        }
    }
}
class RandomThread implements Runnable
{
    Thread t;
    Random r = new Random();
    public void run()
    {
        int hi;
        while(true)
        {
            System.out.println("RandomThread is executing");
            hi = r.nextInt();
            primethreadR pr = new primethreadR(hi);
            t = new Thread(pr);
            t.start();
        }
    }
}
public class Eight_b {
    public static void main(String[] args) {
        RandomThread rt = new RandomThread();
        Thread random = new Thread(rt);
        random.start();
    }
}