package newpackage2;

public class tringle {
public static void main(String[] args) {
	int i,j,k;
	
	
	for(  i=1;i<=4;i++) {
		for(  j=1;j<=4-i;j++) {
			System.out.print(" ");
		}
		for ( k=1;k<=2*i-1;k++) {
			if( k==1||k==2*i-1||i==4) {
				System.out.print("*");
			}else {
			System.out.print(" ");
		}
}	
		System.out.println(); 
		}
}
}


