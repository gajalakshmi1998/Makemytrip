package Member;

public class Ticket implements sign_In, darsha{
	
	public void select_Date() {
		System.out.println( "Select_date:"  + "Jan 23, 2023");
	}
     public void select_Timing() {
		System.out.println("Select_timing:" + "5.00 am");
		}
	public void phone_Number() {
		System.out.println("Enter the mobile number:" + "976543218");
	}

	public void enter_The_Otp() {
		System.out.println("Enter the otp:" + "677898");
		
		}
	public static void main(String[] args) {
		Ticket tic = new Ticket();
		tic.phone_Number();
		tic.enter_The_Otp();
		tic.select_Date();
		tic.select_Timing();
		
	}
	
	
	

}
