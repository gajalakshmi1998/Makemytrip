package Member;
 
import java.util.Arrays;
 
public class Types {
	public static void main(String[] args) {
		
		int dress[] = new int [3];
		
		dress[0] = 500;
		dress[1] = 200;
		dress[2] = 600;
		
		
		System.out.println(dress[0]);
		
		System.out.println("******************");
		
		
		System.out.println(dress.length);
		
		System.out.println("*******************");
		
		System.out.println(Arrays.toString(dress));
		
		System.out.println("******************");
		
		for(int i=0;i<dress.length;i++) {
			System.out.println(dress[i]);
			
		}
		
		
		
		
	}

}
