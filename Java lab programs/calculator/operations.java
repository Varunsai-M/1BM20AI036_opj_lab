package calculator;
public class operations{
int n1,n2;
public operations(int a, int b){
this.n1=a;
this.n2=b;
}
public void sum(){
System.out.println("Addition of 2 int, sum =" + (n1+n2));
} 
public void difference(){
System.out.println("Difference of 2 int, difference =" + (n1-n2));
}
public void multiply(){
System.out.println("Multiplication of 2 int, product =" + (n1*n2));
}
public void divide(){
System.out.println("Division of 2 int, Division =" + (n1/n2));
}
}
