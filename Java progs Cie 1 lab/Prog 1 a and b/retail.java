class Retailitem
{
 
  String description;
  int units;
  double price;
 
  Retailitem(String d, int u, double p)
  {
      this.description=d;
      this.units=u;
      this.price=p;
  }
 
  void setDesc(String d)
  {
      description=d;
  }
     
 
  void setUnits(int u)
     {
      units=u;
     }
 
  void setPrice(double p)
  {
      price=p;
  }
 
  String getDesc()
  {
      return description;
  }
     
 
  int getUnits()
     {
       return units;
     }
  double getPrice()
  {
      return price;
  }
 
}
 
class retail
{
  public static void main(String args[])
  {
      Retailitem o1 = new Retailitem("Sweather",10,20.67);
      o1.setDesc("Heels");
      o1.setPrice(1499.00);
      o1.setUnits(20);
 
      System.out.println("Item Description ="+ o1.getDesc());
      System.out.println("Units  ="+ o1.getUnits());
      System.out.println("Price ="+ o1.getPrice());
 
  }
}
