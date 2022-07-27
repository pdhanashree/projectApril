package stringmethods;
public class Reverse2 {
public static void main(String[] args) {
	String k="Radhika";
	String rev="";
	for(int i=k.length()-1;i>=0;i--) {
	rev=rev+k.charAt(i);
}
   System.out.println(rev);

	}
}