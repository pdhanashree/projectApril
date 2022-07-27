package Assignment;

public class evenPosition {
public static void main(String[] args) {
	int a[]={4,5,7,8,9};
	System.out.println("elements of array present on even position :");
	
	for(int i=1;i<a.length;i=i+2) {
		System.out.println(a[i]);
	}
	
}
}
