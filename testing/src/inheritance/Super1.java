package inheritance;

public class Super1 extends Super{
int a=90;
public void Test() {
	int a=80;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
public static void main(String[] args) {
	Super1 x=new Super1();
	x.Test();
}
}
