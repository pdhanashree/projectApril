package Starpattern;

public class pattern16 {
public static void main(String[] args) {

	for(int i=1;i<=5;i++) {
		int j;
	
		for( j=i;j<=5;j++) {
			
			System.out.print(" ");
		}
		for( j=1;j<=i;j++) {
		if(i==5||j==1||j==i) {
		
			System.out.print("*");
		}
		else {
		System.out.print(" ");
			
		}
	}
		System.out.println();
}
}
}
	


