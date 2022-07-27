package collection;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	 
	ArrayList list= new ArrayList();
	
	list.add(12345);
	list.add("velocity");
	list.add('#');
	list.add(83.27f);
	
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
