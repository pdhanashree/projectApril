package controlstatements;

public class ladderif {
public static void main(String[] args) {
	String projectdomain ="Banking";

	if (projectdomain=="healthcare") {
		System.out.println("Medical work Related");
	}
		else if(projectdomain =="Banking"){
			System.out.println("Money related transction work");
		}
		else if (projectdomain =="Telecom") {
			System.out.println("Communication Related Work");
			
		}
		else if (projectdomain =="Booking portal") {
	System.out.println("Work related to travelling ticket");
	
}
     else {
	System.out.println("random project domain");
}
}
}
