package inheritance;

public class Radha1 extends Radha{
	public void show() {
		System.out.println("Running show method");
	}
	public void blank() {
		System.out.println("Running blank method");
	}
	public static void main(String[] args) {
		Radha1 x=new Radha1();
		x.display();
		x.show();
		x.blank();
		
	}

}
