package Member;

public class Dataw {
	
	public static void main(String[] args) {
		
		// widening
		
		byte var = 12;
		double var1= var;
		
		System.out.println(var1);
		
		short var2 = 56;
		float var3 = var2;
		System.out.println(var3);
		
		//narrowing
		
		double var6 = 12.46;
		int var7 = (int) var6;
		System.out.println(var7);
		
		long var8 = 645987456;
		short var9 = (short) var8;
		System.out.println(var9);
		
		
		
}
	

}
