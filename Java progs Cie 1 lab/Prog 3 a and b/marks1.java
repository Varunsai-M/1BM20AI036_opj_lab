abstract class marks
{
   abstract double getPercentage();
}
 
class A extends marks
{   int marks1;
   int marks2;
   int marks3;
 
   A(int m1,int m2,int m3)
   {
       this.marks1=m1;
       this.marks2=m2;
       this.marks3=m3;
 
   }
   double getPercentage()
   {
       double p = (marks1+marks2+marks3)/3;
       return p;
   }
}
 
class B extends marks
{  int marks1;
   int marks2;
   int marks3;
   int marks4;
 
   B(int m1,int m2,int m3,int m4)
   {
       this.marks1=m1;
       this.marks2=m2;
       this.marks3=m3;
       this.marks4=m4;
 
   }
   double getPercentage()
   {
       double p = (marks1+marks2+marks3+marks4)/4;
       return p;
   }
}
 
class marks1
{
   public static void main(String args[])
   {
       marks o1 = new A(78,96,80);
       marks  o2 = new B(99,89,76,93);
       System.out.println("Percentage of A = "+o1.getPercentage());
       System.out.println("Percentage of B = "+o2.getPercentage());
 
   }
}
