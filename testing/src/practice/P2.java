package practice;

public class P2 {
public  P2() {
	System.out.println("Defalut constructor");
	}
public  P2(int x, int y) {
	System.out.println("x+y ="+(x+y));
}
public static void main(String[] args) {
	P2 x1=new P2(9,10);
	new P2();
	P3 a=new P3();
	P3 b=new P3(5,2);
}
}
