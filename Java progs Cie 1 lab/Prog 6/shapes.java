interface volume
{
   public double getVolume();
}
 
interface area
{
   public double getArea();
}
 
class shape
{
   String name;
   shape(String n)
   {
       name = n;
   }
 
   String getName()
   {
       return name;
   }
}
 
class circle extends shape implements area
{
   double radius; 
   circle(double r, String n)
   {
       super(n);
       this.radius=r;
   }
 
   public double getArea()
   {
       return (Math.PI)*radius*radius;
   }
 
}
 
class square extends shape implements area
{
   double side;
   square(double s,String n)
   {
       super(n);
       this.side=s;
   }
 
   public double getArea()
   {
       return side*side;
   }
 
}
 
class cylinder extends circle implements volume
{
   double height;
   cylinder(double h,double r,String n)
   {
       super(r,n);
       this.height=h;
   }
 
   public double getVolume()
   {
       return Math.PI*radius*radius*height;
   }
 
}
 
class sphere extends circle implements volume
{
  
   sphere(double r,String n)
   {
       super(r,n);
   }
 
   public double getVolume()
   {
       return (4/3)*Math.PI*radius*radius*radius;
   }
 
}
 
class cube extends square implements volume
{
   cube(double s,String n)
   {
       super(s,n);
   }
 
   public double getVolume()
   {
       return side*side*side;
   }
 
}
 
class glome extends sphere
{
   glome(double r,String n)
   {
       super(r,n);
   }
 
   public double getVolume()
   {
       return 2*(Math.PI)*(Math.PI)*radius*radius*radius;
   }
 
}
 
class shapes
{
   public static void main(String args[])
   {
       circle o1 = new circle(2,"Circle");
       System.out.println("The area of "+o1.getName()+" is "+o1.getArea());
 
       square o2 = new square(2,"Square");
       System.out.println("The area of "+o2.getName()+" is "+o2.getArea());
 
       cylinder o3 = new cylinder(4,2,"Cylinder");
       System.out.println("The volume of "+o3.getName()+" is "+o3.getVolume());
 
       sphere o4 = new sphere(2,"Sphere");
       System.out.println("The volume of "+o4.getName()+" is "+o4.getVolume());
 
       cube o5 = new cube(2,"Cube");
       System.out.println("The volume of "+o5.getName()+" is "+o5.getVolume());
 
       glome o6 = new glome(2,"Glome");
       System.out.println("The volume of "+o6.getName()+" is "+o6.getVolume());
 
   }
}
