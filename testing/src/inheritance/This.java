package inheritance;

public class This {
int a=50;
public void add() {
int a=80;
System.out.println(this.a);
System.out.println(a);
}
public static void main(String[] args) {
	This x= new This();
	x.add();
			
}
}