package practice;

public class revString1 {
public static void main(String[] args) {
	String s="Dhanu";
	String rev=" ";
	 
	for(int i=s.length()-1;i>=0;i--) {
	    rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
