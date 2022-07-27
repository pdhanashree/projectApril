package inheritance;

public class Super2 extends Super1 {
int a=70;
public void demo() {
	System.out.println(this.a);
	System.out.println(super.a);
}
public static void main(String[] args) {
	Super2 s= new Super2();
	s.Test();
	s.demo();
}
}
