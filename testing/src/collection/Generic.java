package collection;

import java.util.ArrayList;

public class Generic {
	public static void main(String[] args) {
		 
		ArrayList <Integer> list= new ArrayList<Integer>();
		
		list.add(12345);
		list.add(457);
		list.add(3456);
		list.add(8337);
		
		int size = list.size();
		System.out.println("Size :"+ size);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============================================");
		
		list.remove(1);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
}
}
