package mainmethod;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	Scanner Demo =new Scanner(System.in);
	System.out.println("Enter The integer: ");
	
	int Value = Demo.nextInt();
	System.out.println("You entered Value is " + Value);
	
	System.out.println("Enter the Float: ");
	
	float sd=Demo.nextFloat();
	System.out.println("You entered value is " + sd);
	System.out.println("Enter the String:");
	
	String sf=Demo.next();
	System.out.println("You entered String is "+ sf);
	
	Demo.close();
}
}
