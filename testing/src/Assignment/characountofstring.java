package Assignment;

public class characountofstring {
public static void main(String[] args) {
	String  a ="DHANASHREE";
	int count=0;
	
	for( int i=0;i<a.length();i++) {
		
		if(a.charAt(i)!=' ')
			count++;
		
	}
	System.out.println("total no.of character count:"+ count);
			
}
}
