package AccessSpecifier1;

public class Access1 {
public int a=30;
private int b=40;
protected int c=50;
int d=60;
public static void main(String[] args) {
	Access1 x =new Access1();
	System.out.println(x.a);
	System.out.println(x.b);
	System.out.println(x.c);
	System.out.println(x.d);
}
}
