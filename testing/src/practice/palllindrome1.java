package practice;

public class palllindrome1 {
public static void main(String[] args) {
	String s="WOW";
	String rev="";
	
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(s.equals(rev)) {
		System.out.println("given String is pallindrome");
	}
	else {
		System.out.println("Given String is not pallindrome");
	}
}
}
