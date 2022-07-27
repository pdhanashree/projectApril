package staticmethodofnterface;

public class Test1 implements Test{
public void Q1() {
	System.out.println("Q1 is running");
}
public void Q2() {
	System.out.println("Q2 is running");
}
public static void main(String[] args) {
	Test1 x =new Test1();
	x.Q1();
	x.Q2();
	Test.M();
}
}
