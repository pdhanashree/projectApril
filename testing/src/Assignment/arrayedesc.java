package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class arrayedesc {
public static void main(String[] args) {
	Integer a []= {5,6,4,2,3,1};
	Arrays.sort(a,Comparator.reverseOrder());
	System.out.println(Arrays.toString(a));
	
		
	}
	
}

