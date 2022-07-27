package inheritance;

public class Dhanu extends Dhanu1 {
public void show() {
	System.out.println("Running Show method");
}
public void blank() {
	System.out.println("Running blank method");
}
public static void main(String[] args) {
	
	Dhanu x=new Dhanu();
	x.display();
	x.show();
	x.blank();
}
}

