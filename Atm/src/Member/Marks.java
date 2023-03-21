package Member;

import java.util.Scanner;

public class Marks {
	private void sheet() {
		
	Scanner s = new Scanner(System.in);
	  int grade = s.nextInt();
	  
	  if(grade>=85)
	  {
		  System.out.println("A grade");
	  }
	  else if (grade<=84 && grade>=65)
	  {
		  System.out.println("B grade");
		}
	  else {
		  System.out.println("C grade");
	  }
	}
	  public static void main(String[] args) {
       
		   Marks ref = new Marks();
		   System.out.println("Enter the mark");
		   ref.sheet();
		   System.out.println();
		   
		   Marks ref1 = new Marks();
		   System.out.println("Enter the mark");
		   ref1.sheet();
		   System.out.println();
		   
		   Marks ref2 = new Marks();
		   System.out.println("Enter the mark");
		   ref2.sheet();
		   System.out.println();
		   

}}
