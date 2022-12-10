import java.lang.Math;
class Number
{
    private double a;
    Number(int n1)
    {
      this.a=n1;
    }
    
    public bool isZero()
    {
      if(a==0)
         return true;
      else
         return false;
    }
    
    public bool isPositive()
    {
      if(a>0)
         return true;
      else
         return false;

    }
    
    public bool isEven()
    {
      if(a%2==0)
         return true;
      else
         return false;

    }
    
    public bool isPrime()
    {    int c=0;
         for(i=1;i<=a;i++)
         {
            if(a%i==0)
               c++;
         };
         if(c==2)
            return true;
         else
            return false;
     }
     
     public bool isArmstrong()
     {
          int s=0;
          for(i=n;i>0;i=n/10)
          {
            int d = i%10;
            s = s+(d*d*d);
          }
          if(s==n)
            return true;
          else
            return false;

     }
     
     public double getfactorial()
     {
         double f=1.0;
         for(i=1;i<=n;i++)
         {
            f=f*i;
         }
         return f;
     }
     
     public double getSqrt()
     {
         double s=0.0;
         s = Math.sqrt(a);
         return s;
     }
     
     public double getSqr()
     {
         return a*a;
     }
    
     public double sumDigits()
     {
          double s=0.0;
          for(i=n;i>0;i=n/10)
          {
            int d = i%10;
            s = s+d;
          }
          return s;
      }
      
      public double getReverse()
      {
         double s=0.0;
          for(i=n;i>0;i=n/10)
          {
            int d = i%10;
            s = s*10+d;
          }
          
          return s;

      }
      
      public void listFactors()
      {
         int c=0;
         System.out.println("The factors are:");
         for(i=1;i<=a;i++)
         {
            if(a%i==0)
               System.out.print(i);
         }
       }
       
       public void dispBinary()
       {
         String s="";
         while(n!=0 || n!=1)
         {
            int r=n%2;
            n=n/2;
            s=s+r;
         }
         System.out.println(s);  
       }
 
 public static void main(String [] args) throws ArrayIndexOutOfBoundsException
 {
  int x=Integer.parseInt(args[0]);
  Number m=new Number(x);
  if(m.isNegative())
   System.out.println("Number is Negative");
  if(m.isPositive())
   System.out.println("Number is Positive");
  if(m.isEven())
   System.out.println("Number is Even");
  if(m.isOdd())
   System.out.println("Number is Odd");
  if(m.isZero())
   System.out.println("Number is Zero");
 }

}