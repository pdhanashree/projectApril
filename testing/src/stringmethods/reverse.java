package stringmethods;

public class reverse {
public static void main(String[] args) {
	String a ="Dhanashree";
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {

		rev= rev+a.charAt(i);
		
	}
	System.out.println(rev);
}
}
