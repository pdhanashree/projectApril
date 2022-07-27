package practice;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		int x,y,z;
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Value of x");
			x=sc.nextInt();
			System.out.println("Enter the Value of y");
			y=sc.nextInt();
		
		System.out.println("addition - "+(x+y));
		System.out.println("substraction -"+(x-y));
		System.out.println("multiplication -"+(x*y));
		System.out.println("Division -"+(x/y));
		System.out.println("module - "+(x%y));
		
		
		System.out.println("x<y - "+(x<y));
		System.out.println("x>y -"+(x>y));
		System.out.println("x<=y -"+(x<=y));
		System.out.println("x>=y -"+(x>=y));
		System.out.println("x==y - "+(x==y));
		System.out.println("x!=y - "+(x!=y));
		
		System.out.println("x<y && x>=y - "+(x<y));
		System.out.println("x<y || x>=y -"+(x>y));
		System.out.println("!(x<=y) -"+(!(x<=y)));
	}
}
