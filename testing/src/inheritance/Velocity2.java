package inheritance;

public class Velocity2 extends Velocity1{
public void success() {
	System.out.println("Coporate world");
}
public static void main(String[] args) {
	Velocity2 v=new  Velocity2();
	v.testing();
	v.development();
	v.success();
	}
}
