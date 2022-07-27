package Assignment;

public class oddposition {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println("elements present in given array at odd position :");
	
	for(int i=0;i<a.length;i=i+2) {
		System.out.println(a[i]);
	}
}
}
