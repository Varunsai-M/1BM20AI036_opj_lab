package cpack;
 
import apack.a;
 
public class c
{
   public void display()
   {
       a o1 = new a();
       System.out.println("Class C");
       //System.out.println("default p ="+o1.p); can't access p since default variable
       //System.out.println("protected q ="+ o1.q);can't access q since protected variable
       //System.out.println("private r ="+ o1.r); can't access r since its private
       System.out.println("Public s = "+ o1.s);
      
   }
}
