package exmock;

import java.util.Arrays;



public class descarray {
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		System.out.println("Desc order array");
		
		Arrays.sort(ar);
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
		
		
	}
}
		
	


