enum size
{
 regular,
 medium,
 large,
 monster
}

class test
{
 size s;
 test(size x)
 {
  this.s=x;
 }
 void order_pizza()
 {
  switch(s)
  {
   case regular:System.out.println("order confirm:regular pizza");break;
   case medium:System.out.println("order confirm:medium pizza");break;
   case large:System.out.println("order confirm:big pizza");break;
   case monster:System.out.println("order confirm:monster pizza");break;
   default:System.out.println("Invalid");
  }
 }
}

class pizza
{
 public static void main(String args[])
 {
  for(size s:size.values())
  {
   test t=new test(s);
   t.order_pizza();
  }
 }
}