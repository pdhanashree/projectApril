package newpackage2;

public class pattern13 {
	public static void main(String[] args) {
		

		int i,j,r=4;
		for(i=r;i>=1;i--) {
			for(j=0;j<=r-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i-1;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
			for(i=2;i<=r;i++) {
				for(j=0;j<=r-i;j++) {
					System.out.print(" ");
				}
				for(j=0;j<=i-1;j++) {
					System.out.print("*");
					}
				System.out.println();
			}
			
		
	}
}
