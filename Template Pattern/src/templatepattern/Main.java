package templatepattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First order: ");
		Pizza1 p1 = new Pizza1();
		Pizza2 p2 = new Pizza2();
		
		p1.preparePizza();
		p2.preparePizza();
		
		System.out.println("Second Order: ");
		Pizza1 p3 = new Pizza1();
		Pizza2 p4 = new Pizza2();
		
		p3.preparePizza();
		p4.preparePizza();

		
	}

}
