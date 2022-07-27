package practice;

public class pallindrome {
public static void main(String[] args) {
	 
	String D="MOM";
	String rev ="";
	 
	for(int i=D.length()-1;i>=0;i--) {
		rev=rev+D.charAt(i);	
	}
	System.out.println(rev);
			if(D.equals(rev)) {
				System.out.println("Given string is pallindrome");
			}
			else {
				System.out.println("Given string is not pallindrome");
			}
}
}
