package Assignment;

public class uncommonelefrom2array {
public static void main(String[] args) {
	int a[]= {20,30,11,50};
	int b[]= {20,30,50};
	
	for(int i=1;i<a.length;i++)
		for(int j=i+2;j<b.length-1;j++) {
			
			if (a[i] !=b[j]){
				
				System.out.println("Uncommon elements is :"+a[i]);
			}
		}
}
}
