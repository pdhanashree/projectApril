package Array;

import java.util.Arrays;

public class array3 {
public static void main(String[] args) {
	int ar[]= {10,30,60,40,50,20};
	System.out.println("_____________original info Array");
	for (int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	System.out.println("__________Array in asscending order _____________");
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	System.out.println("__________Array in desending order");
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
	}
}
}
