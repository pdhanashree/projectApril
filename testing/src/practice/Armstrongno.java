package practice;
public class Armstrongno {
public static void main(String[] args) {
	int n=153;
	int r;
	int temp=n;
	int sum=0;
	
	while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
	}
	if(temp == sum) {
		System.out.println("its an Amstrong number");
	}
	else {
		System.out.println("not an armstrong number");
	}
		
	
}
}
