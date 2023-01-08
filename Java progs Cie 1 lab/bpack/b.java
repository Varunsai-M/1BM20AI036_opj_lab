package bpack;
import apack.*;
 
public class b extends a{
   public void display()
   { 
       System.out.println("Class B");
       //System.out.println("default p ="+p); can't access p since default variable
       System.out.println("protected q ="+q);
       //System.out.println("private r ="+r); can't access r since its private
       System.out.println("Public s= "+ s);
   }
}
