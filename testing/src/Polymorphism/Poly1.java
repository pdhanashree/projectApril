package Polymorphism;

public class Poly1 {
public void addition (int a,int b) {
	System.out.println("addition="+(a+b));
}
public void addition(int a,int b,int c) {
	System.out.println("addition="+(a+b+c));
}
public static void main(String[] args) {
	Poly1 x=new Poly1();
	x.addition(10,20 );
	x.addition(10, 200, 200);
}
}
