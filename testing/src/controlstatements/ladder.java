package controlstatements;

public class ladder{
public static void main(String[] args) {
	int pointer=75;
	if (pointer>=80) {
		System.out.println("excellent");
		
	}else if(pointer>=70) {
		System.out.println("good");
	}else if(pointer<60) {
		System.out.println("Average");
	}
}
}
