package templatepattern;

public abstract class Template {
	
	public void preparePizza() {
		
		pizzaBase();
		cheeseAddOn();
		toppingsAddOn();
		System.out.print("is ready\n");
	}
	
	public void pizzaBase() {
		
		System.out.print("Thin Crust ");
	}
	public abstract void cheeseAddOn();
	public abstract void toppingsAddOn();

}
