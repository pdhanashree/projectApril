package practice;

public class stringmethods {
public static void main(String[] args) {
	
	String s = "radhika";
	String a="Tillu";
	
	System.out.println(s.charAt(1));
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.concat(a));
	System.out.println(a.toLowerCase());
	System.out.println(s.indexOf("h"));
	System.out.println(s.substring(4));
	System.out.println(a.replace('T','t'));
	System.out.println(s.isEmpty());
}
}
