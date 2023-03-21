package Member;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collections {
	
	public static void main(String[] args) {
		
		List<Object> ref = new ArrayList<Object>();
		
		//add
		ref.add("sunflower");
		ref.add("flower");
		ref.add("4569");
		ref.add("15.236");
		ref.add("sunflower");
		ref.add("flower");
		
		System.out.println(ref);
		
		Set <Object> ref1 = new LinkedHashSet<Object>(ref);
		System.out.println(ref1);
		
		
		
		
		
		
	}

}
