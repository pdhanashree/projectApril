package controlstatements;

public class nestedif {
public static void main(String[] args) {
	String UN="Dhanashree";
	String PWD="XYZ";
	
	if (UN=="Dhanashree") {
		System.out.println("correct user name");
		if(PWD =="XYZ") {
			System.out.println("correct password");
			System.out.println("login succesful");
			}
		else {
			System.out.println("Wrong passward");
			System.out.println("login failed");
			
		}
	}
		else {
			System.out.println("Wrong user name");
			System.out.println("login failed");
		}
	}
}

