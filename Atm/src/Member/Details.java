package Member;

public class Details extends Student {
	
	public void student_Id() {
		System.out.println("Stud 2345");
	}
	
	public  void staff_Id() {
		System.out.println("Staff 4567");
	}
	
	public static void main (String[] args) {
	Details id = new Details();
	id.login_Id();
	id.student_Id();
	id.staff_Id();
	
}
}
