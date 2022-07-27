package collection;

import java.util.HashSet;

public class Hashset {
public static void main(String[] args) {
	HashSet<Character>set =new HashSet();
	
	set.add('#');
	set.add('@');
	set.add('!');
	set.add('%');
	
	//Insertion order not maintain
	//Advance for loop
	
	for(char r:set) {
		System.out.println(r);
	}
}
}
