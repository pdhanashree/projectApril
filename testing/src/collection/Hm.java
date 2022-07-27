package collection;

import java.util.HashMap;
import java.util.Map;

public class Hm {
public static void main(String[] args) {
	
	HashMap <Integer,String> map =new HashMap();
	
	map.put(34, "Dhanu");
	map.put(null, "radhika");
	map.put(45, null);
	map.put(20, "kodoli");
	
	for(Map.Entry<Integer,String> e :map.entrySet())
	{
		System.out.println("key "+ e.getKey() + "Value " + e.getValue());
	}
	System.out.println("================================");
	map.put(32, "System");
	for(Map.Entry<Integer, String> e : map.entrySet()) {
		System.out.println("key "+ e.getKey() + "Value "+ e.getValue());
	}
}
}
