package praticeoOnStarpattern;

public class fibonanci {
public static void main(String[] args) {
	 int a= 0;
	 int b=1;
	 int c=10;
	 int i;
	 int d;
	 
	 System.out.print(a+" "+b);
	 for(i=2;i<c;i++) {
		 d=a+b;
		 System.out.print(" "+d);
		 a=b;
		 b=d;
	 }
}
}
