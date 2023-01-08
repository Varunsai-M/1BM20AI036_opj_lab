class car
{
   int model;
   String make;
   int speed;
 
   car(int y, String m, int s)
   {
       this.model=y;
       this.make =m;
       this.speed = s;
   }
 
   int getModel()
   {
       return model;
   }
 
   String getMake()
   {
       return make;
   }
 
   int getSpeed()
   {
       return speed;
   }
 
   int accelarate()
   {
       speed+=5;
       return speed;
   }
 
   int brake()
   {
       speed-=5;
       return speed;
   }
}
 
class car1
{
   public static void main(String args[])
   {
       car o1 = new car(2018,"Hyundai",100);
       System.out.println("Year = "+o1.getModel());
       System.out.println("Make = "+o1.getMake());
       System.out.println("Speed = "+o1.getSpeed());
 
       System.out.println("Accelerating...");
       for(int i=1;i<=5;i++)
       {
           System.out.println("Current Speed = "+o1.accelarate());
       }
 
       System.out.println("Braking...");
       for(int i=1;i<=5;i++)
       {
           System.out.println("Current Speed = "+o1.brake());
       }
 
 
   }
}
