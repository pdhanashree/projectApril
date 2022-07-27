package mainmethod;

public class StaticNonstatic {
public static void addition(int a,int b) {                    //static method with argument
	int c =a+b;
	System.out.println("addition= "+c);
	
}
public  void Multiplication(int a,int b) {                      //non static method with argument
	int c=a*b;
	System.out.println("Multiplication= "+c);
	
}
public static void main(String[] args) {     
	StaticNonstatic x= new StaticNonstatic();               //object for non static method
	addition(12,10);
	x.Multiplication(12, 5);
}
}
