package templatepattern;

public class Pizza1 extends Template{
	

	public Pizza1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cheeseAddOn() {
		// TODO Auto-generated method stub
		System.out.print("pizza with extra cheese");
		
	}

	@Override
	public void toppingsAddOn() {
		// TODO Auto-generated method stub
		
		System.out.print(", Non Veg Toppings ");
		
	}

}
