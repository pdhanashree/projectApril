package stringmethods;

public class Spacecount {
	public static void main(String[] args) {
		String a="Vidhya Mahadev Patil";
		int count =0;
		for(int i=0;i<=a.length()-1;i++) {
			char b=a.charAt(i);
			if(b==' ') {
				count ++;}
			}
		System.out.println(count);
		}
	}


