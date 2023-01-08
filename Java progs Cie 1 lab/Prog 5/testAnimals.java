abstract class animal {
   protected int legs;
   protected animal(int l)
   {
       this.legs = l;
   }
 
   abstract void eat();
 
   void walk()
   {
       System.out.println("Animal walks on "+legs+" legs");
   }
 
}

class spider extends animal
{
   spider()
   {
       super(8);
   }
 
   void eat()
   {
       System.out.println("Spider is eating");
   }
}
 
interface pet
{
   public String getName();
   public void setName(String n);
   public void play();
 
}
 
class cat extends animal implements pet
{
   String cname;
 
   cat()
   {
       this("");
   }
 
   cat(String n)
   {  
       super(4);
       this.cname=n;
      
   }
 
   public void setName(String n)
   {
       cname = n;
   }
 
   public String getName()
   {
       return cname;
   }
 
   public void play()
   {
       System.out.println("Cat is playing");
   }
 
   public void eat()
   {
       System.out.println("Cat is eating");
   }
}
 
class fish extends animal implements pet
{
   String fname; 
 
   fish()
   {  
       super(0);
   }
 
   public void setName(String n)
   {
       fname = n;
   }
 
   public String getName()
   {
       return fname;
   }
 
   public void play()
   {
       System.out.println("Fish is playing");
   }
 
   public void eat()
   {
       System.out.println("Fish is eating");
   }
 
   void walk()//overriding
   {
       System.out.println("Fishes have zero legs to walk");
   }
}
 
 
class testAnimals
{
   public static void main(String args[])
   {
       fish d = new fish();
       cat c = new cat("fluffy");
       animal a = new fish();
       animal e = new spider();
       pet p = new cat();
 
       d.setName("Fish 1");
       System.out.println("Fish is "+d.getName());
       d.play();
       d.eat();
       d.walk();
 
       //c.setName("fluffy");
       System.out.println("Cat's name is "+c.getName());
       c.play();
       c.eat();
       c.walk();
 
       ((fish)a).setName("Fish 2");
       System.out.println("Fish is "+((fish)a).getName());
       ((fish)a).play();
       ((fish)a).eat();
       ((fish)a).walk();
 
       ((spider)e).eat();
       ((spider)e).walk();
 
       ((cat)p).setName("Cat 2");
       System.out.println("Cat's name is "+((cat)p).getName());
       ((cat)p).play();
       ((cat)p).eat();
       ((cat)p).walk();
   }
}
