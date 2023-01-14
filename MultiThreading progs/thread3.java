class t1 extends Thread
{
    public void run()
    {   for(int i=0;i<10;i++)
            System.out.println("Printer 1 is printing");
    }
}


class thread3
{
    public static  void main(String args[])
    {
        t1 o1 = new t1();
        Thread t = new Thread(o1);
        t.start();
        for(int i=0;i<10;i++)
            System.out.println("Printer 2 is printing");
        
    }
}