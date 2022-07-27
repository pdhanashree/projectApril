package stringmethods;

public class Pallindrome {
public static void main(String[] args) {
	String v="MADAM";
	String rev="";
	for(int i=v.length()-1;i>=0;i--) {
		rev=rev+v.charAt(i);
	}
//	System.out.println(rev);

if(v.equals(rev)) {
	System.out.println("Given string is pallindrome");
}
else {
	System.out.println("Given string is not pallindrome");
}
}
}
