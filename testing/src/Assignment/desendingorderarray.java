package Assignment;

import java.util.Arrays;
import java.util.Comparator;

import stringmethods.reverse;

public class desendingorderarray {
public static void main(String[] args) {
	Integer [] array= {1,2,3,4,5};
    Arrays.sort(array,Comparator.reverseOrder());
    
    System.out.println(Arrays.toString(array));
}
}

