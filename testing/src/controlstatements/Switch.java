package controlstatements;

public class Switch {
	public static void main(String[] args) {
		int num=1;
		switch(num) {
		case 1:
			System.out.println("Good morning");
		break;
		case 2:
			System.out.println("Good afternoon");
			break;
		case 3:
			System.out.println("Good evening");
			break;
		case 4:
			System.out.println("Good night");
		    break;
		default:
			System.out.println("goodbye");
		}
	}

}
