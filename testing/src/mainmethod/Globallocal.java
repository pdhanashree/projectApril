package mainmethod;

public class Globallocal {
int a= 90;
public void Demo() {
	int b =80;
	System.out.println(a);
	System.out.println(b);
}
public void Demo1() {
	int c=70;
	System.out.println(a);
	System.out.println(c);
}
public static void main(String[] args) {
	Globallocal x =new Globallocal();
	x.Demo();
	x.Demo1();
}
}
