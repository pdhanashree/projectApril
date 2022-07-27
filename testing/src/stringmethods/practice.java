package stringmethods;

public class practice {
public static void main(String[] args) {
	String s1 ="ironMan";
	String s2="tonystark";
	String s3= "Dhanu";
	String a=new String ("ironMan");
	
	
	System.out.println("-------------------------");
	System.out.println(s1.equals(a));
	System.out.println(s1.charAt(2));
	System.out.println(s1.indent(2));//2space before s1
	System.out.println(s1.indexOf("M"));
	System.out.println(s2.contains(s2));
	System.out.println(s1.endsWith("n"));
	System.out.println(s2.length());
	System.out.println(s2.toUpperCase());
	System.out.println(s2.equalsIgnoreCase(s1));
	System.out.println(s1.isEmpty());
    System.out.println(s1.lastIndexOf("n"));
    System.out.println(s2.substring(4));
    System.out.println(s1.substring(2, 5));
    System.out.println(s1.concat(s3));
    
    
    String b=String.join(s1, s2);
    System.out.println(b);
    String c= String.join(s1, s3);
    System.out.println(c);
    String d=String.join(s1, s2,s3);
    System.out.println(d);
}
}
