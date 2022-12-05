class car{
private int model;
private String make;
private int speed;
car(int m, String mak, int sp){
model = m;
mak = make;
speed = sp;
}
void display(){
System.out.println("model:"+model);
System.out.println("make:"+make);
System.out.println("speed:"+speed);
}
int accelerate(){
speed += 5;
return speed;
}
int brake(){
speed -= 5;
return speed;
}
}
class One_b{
public static void main(String args[]){
car c = new car(2000, "Ferrari", 150);
System.out.println("Updated speed after acceleration:" + c.accelerate());
System.out.println("Updated speed after acceleration:" + c.accelerate());
System.out.println("Updated speed after acceleration:" + c.accelerate());
System.out.println("Updated speed after acceleration:" + c.accelerate());
System.out.println("Updated speed after acceleration:" + c.accelerate());
System.out.println("");
System.out.println("Updated speed after brake:" + c.brake());
System.out.println("Updated speed after brake:" + c.brake());
System.out.println("Updated speed after brake:" + c.brake());
System.out.println("Updated speed after brake:" + c.brake());
System.out.println("Updated speed after brake:" + c.brake());
}
}

