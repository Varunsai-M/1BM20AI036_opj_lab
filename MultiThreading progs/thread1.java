class t1 extends Thread
{
    public void run()
    {
            System.out.println("Thread is Running");
    }
}


class thread1
{
    public static  void main(String args[])
    {
        t1 o1 = new t1();
        Thread t = new Thread(o1);
        t.start();
        
    }
}