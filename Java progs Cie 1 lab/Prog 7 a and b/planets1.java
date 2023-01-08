enum Planets
{
   MERCURY(88),
   VENUS(225),
   EARTH(365),
   MARS(687),
   JUPITER(4333),
   SATURN(10759),
   URANUS(30687),
   NEPTUNE(60200);
 
   private final int yearLength;
 
   Planets(int yearLength) {
       this.yearLength = yearLength;
   }
 
   public int getYearLength()
   {
       return yearLength;
   }
 
}
 
class planets1
{
   public static void main(String args[])
   {
       for(Planets p:Planets.values())
       {
           System.out.println("Planet "+p+" = "+p.getYearLength()+" earth days");
       }
 
   }
}
