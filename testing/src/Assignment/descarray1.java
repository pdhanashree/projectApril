package Assignment;

import java.util.Arrays;
import java.util.Comparator;

public class descarray1 {
public static void main(String[] args) {
	String [] array= {"Altaf","pushkar","Swati"};
	Arrays.sort(array, Comparator.reverseOrder());
	System.out.println(Arrays.toString(array));
}

}
