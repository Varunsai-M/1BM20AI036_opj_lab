class retail_item{
private String description;
private int units;
private double price;

retail_item(String desc,int unit, double pr){
description = desc;
units = unit;
price = pr;
}

String get_desc(){
return description;
}
int get_units(){
return units;
}
double get_price(){
return price;
}
}
class retailitem{
public static void main(String args[]){
retail_item r1 = new retail_item("Kitkat", 10, 20.00);
System.out.println("Description:"+r1.get_desc());
System.out.println("Number of items:"+r1.get_units());
System.out.println("Price:"+r1.get_price());
}
}
