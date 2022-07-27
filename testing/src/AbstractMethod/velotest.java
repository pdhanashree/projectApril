package AbstractMethod;

public class velotest implements velo {
public void mart() {
	System.out.println("all shops open");
}
public static void main(String[] args) {
	velo1 x =new velo1();
	velotest y=new velotest();
	
	x.Dmart();
	x.mart();
	
	y.mart();
	y.Dmart();
	
}
}
 