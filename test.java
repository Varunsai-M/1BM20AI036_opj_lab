class retail_item{
private String description;
private int units;
private double price;

retail_item(String desc,int unit, double pr){
description = desc;
units = unit;
price = pr;
}
void display(){
System.out.println("Item deets:");
System.out.println("Description:"+description);
System.out.println("Number of items:"+units);
System.out.println("Price:"+price);
}
}
class test{
public static void main(String args[]){
retail_item r1 = new retail_item("Item1", 10, 100);
retail_item r2 = new retail_item("Item2", 20, 200);
retail_item r3 = new retail_item("Item3", 30, 300);
r1.display();
r2.display();
r3.display();
}
}