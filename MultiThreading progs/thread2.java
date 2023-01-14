class t1 implements Runnable
{
    public void run()
    {
            System.out.println("Thread is Running");
    }
}


class thread2
{
    public static  void main(String args[])
    {
        t1 o1 = new t1();
        Thread t = new Thread(o1);
        t.start();
        
    }
}