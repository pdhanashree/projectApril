package mainmethod;

public class Overload {
public static void main(int a) {             //overload =static method with different argument
	System.out.println(a);
}
public static void main(char b ) {
	System.out.println(b);
	
}
public static void main(String[] args) {
	System.out.println("main method is started");
	main(25);
	main('@');
	System.out.println("main method ended");
}

}

