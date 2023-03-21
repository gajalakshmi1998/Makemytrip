package Member;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
 

public class Print {

	public static void main(String[] args) {
		Set <Object> mem = new HashSet<Object>();
		
		//add
		
		mem.add("karthi");
		mem.add("abi");
		mem.add("cat");
		mem.add("bala");
		mem.add("manickam");
		
		System.out.println(mem);
		
		Set <Object> mem1 = new LinkedHashSet<Object>();
		
		//add
		
		mem1.add("1245");
		mem1.add("12.85");
		mem1.add("456");
		mem1.add("bala");
		mem1.add("karthi");
		System.out.println(mem1);
		
		//addall
		
		
		mem1.addAll(mem);
		System.out.println(mem1);
		
		//retain all
		
		mem1.retainAll(mem);
		System.out.println(mem1);
		
		//removeall
		
		mem1.removeAll(mem);
		System.out.println(mem1);
		
		
		
		
		
		
		
	}

}
