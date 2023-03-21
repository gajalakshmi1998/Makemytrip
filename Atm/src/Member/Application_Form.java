package Member;

import java.util.Scanner;

public class Application_Form {
	
	public static void main(String[] args) {
		Scanner details = new Scanner(System.in);
		System.out.println("College Name");
		String app = details.nextLine();
		System.out.println("College Name:"+app);
		System.out.println();
		
		System.out.println("Student Name");
		String app1 = details.next();
		System.out.println("Enter the student Name:"+app1);
		System.out.println();
		
		System.out.println("Admission Number");
		int app2 = details.nextInt();
		System.out.println("Enter the Admission number:"+app2);
	    System.out.println();
		
		System.out.println("CGPA");
		float app3 = details.nextFloat();
		System.out.println("Enter the CGPA:"+app3);
		System.out.println();
		
		System.out.println("Mobile phone");
		long app4 = details.nextLong();
		System.out.println("Enter the mobile number:"+app4);+\
		System.out.println();
		
		System.out.println("section");
		char app5 = details.next().charAt(2);
		System.out.println("Enter the section:"+app5);
		
		
		
		
		
		
	}


}
m4