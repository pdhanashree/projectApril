package Assignment;

public class copyarray {
public static void main(String[] args) {
	
	int ar1[]= {1,2,3,4,5};
	int ar2[]= new int[ar1.length];
	 
	System.out.println("Elements of array:");
	
	for(int i=0;i<ar1.length;i++) {
		ar2[i]=ar1[i];
		System.out.print(ar1[i]+" ");
	}
	System.out.println();
	
	System.out.println("Elements of new array:");
	  
	for(int i=0;i<ar2.length;i++) {
		System.out.print(ar2[i]+" ");
	}
	
}
}
