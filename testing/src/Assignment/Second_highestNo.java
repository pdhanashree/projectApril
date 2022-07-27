package Assignment;

import java.util.Arrays;

public class Second_highestNo {
public static void main(String[] args) {
	
	int ar[]= {11,26,61,53,32,77};
	int size =ar.length;
	
	Arrays.sort(ar);
	System.out.println("Sorted Array: "+Arrays.toString(ar));
    int result=ar[size-2];
    System.out.println("2nd largest element is :"+result);


}
}
