class Number {
   private double a;
 
   Number(double x)
   {
       this.a=x;
   }
 
   double geta()
      {return a;}
 
   boolean isZero()
   {
       if(a==0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
 
   boolean isPositive()
   {
       if(a>0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
 
   boolean isNegative()
   {
       if(a<0)
       {
           return true;
       }
 else
       {
           return false;
       }
   }
 
   boolean isOdd()
   {
       if(a%2!=0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
 
   boolean isEven()
   {
       if(a%2==0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
 
   boolean isPrime()
   {   if(a==2)
           return true;
       else if(a==0||a==1)
           return false;
       else
       {   int x=(int)a;
           for(int i=2;i<=x/2;i++)
           {
               if(x%i==0)
                   return false;
           }
 }
      
       return true;
   }
 
   boolean isArmstrong()
   {
       int s=0;
       int x=(int)a;
       while(x!=0)
       {
           int d=x%10;
           s=s+(d*d*d);
           x=(int)x/10;
       }
 
       if(s==a)
           return true;
       else
           return false;
   }
 
   double getFactorial()
   {
       double f=1;
       for(double i = a;i>=1;i--)
       {
           f=f*i;
       }
       return f;
   }
 
   double getSqrt()
   {
      return Math.sqrt(a);
   }
 
   double getSqr()
   {
       return Math.pow(a,2);
   }
 
 double sumDigits()
   {
       double s=0;
       int x=(int)a;
       while(x!=0)
       {
           int d=x%10;
           s=s+d;
           x=(int)x/10;
       }
       return s;
 
   }
 
   double getReverse()
   {
       double s=0;
       int x=(int)a;
       while(x!=0)
       {
           int d=x%10;
           s=s*10+d;
           x=(int)x/10;
       }
       return s;
   }
}
 
class number1{
   public static void main(String args[])
   {
       Number o1 = new Number(371);
       double x = o1.geta();
       System.out.println(x+" is zero - "+o1.isZero());
       System.out.println(x+" is positve - "+o1.isPositive());
       System.out.println(x+" is negative - "+o1.isNegative());
       System.out.println(x+" is odd - "+o1.isOdd());
       System.out.println(x+" is even - "+o1.isEven());
       System.out.println(x+" is armstrong - "+o1.isArmstrong());
       System.out.println(x+" is prime - "+o1.isPrime());
       System.out.println("factorial of "+x+" is "+o1.getFactorial());       
       System.out.println("square root of "+x+" is "+o1.getSqrt());
       System.out.println("square of "+x+" is "+o1.getSqr());
       System.out.println("sum of digits of "+x+" is "+o1.sumDigits());
       System.out.println("reverse of "+x+" is "+o1.getReverse());
     
   }
}
