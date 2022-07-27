package inheritance;

public class Son extends Father {
public void bike() {
	System.out.println("bike");
}
public static void main(String[] args) {
	Son x= new Son();
	x.bike();
	x.car();
	x.home();
	x.money();
}
}
