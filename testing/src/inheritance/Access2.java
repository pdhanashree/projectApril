package inheritance;

public class Access2 extends Access1 {
	int a=5,b=5;
	int c=a*b;
public void mul() {
	System.out.println(c);
}
public static void main(String[] args) {
	Access2 x= new Access2();
	x.add1(15,5);
	x.mul();
}
	
}
