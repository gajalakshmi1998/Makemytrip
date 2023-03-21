package Member;

public class Dresses {

	public Dresses() {
		System.out.println("dress");
}
	public Dresses(String types) {
		System.out.println("Dress Types:" + types);
	}
	
	public Dresses(int price) {
		System.out.println("Price:" + price);
	}
	
	public Dresses(long number) {
		System.out.println("Serial number:" + number);
	}
	
	public Dresses(char paid) {
		System.out.println("amount paid:" + paid);
	}
	
	public static void main(String[] args) {
		Dresses dre1 = new Dresses();
		Dresses dre2 = new Dresses("Western dress");
		Dresses dre3 = new Dresses(599);
		Dresses dre4 = new Dresses(564789124);
		Dresses dre6 = new Dresses("P");
	}
}
