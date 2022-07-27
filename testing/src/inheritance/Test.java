package inheritance;

public class Test implements Interface {

	public void M1() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("Running M1 method");
	}
	public void M2() {
		System.out.println("Running M2 method");
	}
	public static void main(String[] args) {
		Test t= new Test();
		System.out.println(t.a);
		t.M1();
		t.M2();
	}
}