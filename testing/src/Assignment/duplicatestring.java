package Assignment;

public class duplicatestring {
	public static void main(String[] args) {
		
		String a [] ={"java","api","selenium","SQL","java"};
	    System.out.println("Duplicate string from array:");

		for( int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {    //i=0,j=2,i=3
				
				if(a[i]== a[j])
					System.out.println( a[j]);
			}
		}
	} 

	}


