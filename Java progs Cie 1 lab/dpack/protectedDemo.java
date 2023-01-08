package dpack;
 
import bpack.b;
import cpack.c;
 
public class protectedDemo
{
   public static void main(String args[])
   {
       b o1 = new b();
       c o2 = new c();
 
       o1.display();
       o2.display();
 
   }
}
