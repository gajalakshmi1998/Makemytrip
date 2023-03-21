package Member;

public class Loop {
	
	public static void main(String[] args) {

		for (int a=1; a<=20; a++) {
			if(a==14) {
				break;
			}
			
		 System.out.println(a);
		}
		System.out.println();
		
		
		System.out.println("continue");
		System.out.println();
		
		for(int b=1; b<=10; b++) {
			if(b==9) {
				continue;
			}
			System.out.println(b);
		}
		
		

}
}
