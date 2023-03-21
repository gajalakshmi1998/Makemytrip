package Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
		
		Map<Integer,String> mems = new LinkedHashMap<Integer,String>();
		mems.put(1,"don bosco");
		mems.put(2,"velammal");
		mems.put(3,"pks school");
		mems.put(4,"dhanalakshmi school");
		mems.put(5,"government");
		mems.put(6, "don bosco");
		
		
		System.out.println(mems);
		
		int size = mems.size();
		System.out.println(size);
		
	String string = mems.get(mems);
	System.out.println(string);
	
	Set<Integer> keySet = mems.keySet();
	System.out.println(keySet);
	
	Collection<String> values = mems.values();
	System.out.println(values);
	
	boolean containsKey = mems.containsKey(4);
	System.out.println(containsKey);
	
	boolean containsValue = mems.containsValue("dhanalakshmi school");
	System.out.println(containsValue);
	
	Set<Entry<Integer, String>> entrySet = mems.entrySet();
	System.out.println(entrySet);
	
		
	
		
		

	}

}
