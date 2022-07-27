package mainmethod;

public class sample {                //static method call from same class
public static void main(String[] args) {
	System.out.println("Main method is started");
	M1();
	M2();
	System.out.println("Main method ended");
	
}
public static void M1() {
	System.out.println("Main method from M1");
	
}
public static void M2() {
	System.out.println("static method from M2");
}
}
