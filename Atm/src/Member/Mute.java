package Member;

public class Mute {

	public static void main(String[] args) {
	
		// inmutuable or literal string
		
		String school = "don bosco";
		String school1 = "velammal";
		String school2 = "everwin";
		String school3 = "don bosco";

		System.out.println(System.identityHashCode(school));
		System.out.println(System.identityHashCode(school3));
		
		System.out.println("-------------");
		
		System.out.println(System.identityHashCode(school=school+school2));
		
		System.out.println("-------------");
	
	//mutable or non-literal string
		
		StringBuffer school4 = new StringBuffer("kindergarden");
		StringBuffer school5 = new StringBuffer("primary school");
		StringBuffer school6 = new StringBuffer("kindergarden");
		
		
		System.out.println(System.identityHashCode(school4));

		System.out.println("-------------");

		System.out.println(System.identityHashCode(school6));
		
		System.out.println("############");
		
		System.out.println(System.identityHashCode(school4= school4.append(school6)));
		
		System.out.println("%%%%%%%%%%%");
		
		StringBuilder school7 = new StringBuilder("10th");
		StringBuilder school8 = new StringBuilder("12th");
		StringBuilder school9 = new StringBuilder("10th");
		
		System.out.println(System.identityHashCode(school7));
		System.out.println("-------------");

		System.out.println(System.identityHashCode(school8));
		
		System.out.println("-------------");
		
		System.out.println(System.identityHashCode(school8= school8.append(school7)));
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	
	

}
