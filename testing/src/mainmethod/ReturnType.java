package mainmethod;

public class ReturnType {
	
	static int Demo() {
		int x=15;
		int y=30;
		int z=x+y;
		return z;
	}
	static String test() {
		return "Welcome Velocity";
	}
	public static void main(String[] args) {
		int z=Demo();
		String x=test();
		System.out.println(z);
		System.out.println(x);
	}

}
