package statepattern;

public class Phone{
	
	private State state;

	public Phone() {
		this.state = new OffState(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	
	public void lock() {
		
		System.out.println("Locking Screen and turning off the screen\n");
	}

	
	public void unLock() {
		
		System.out.println("Unlocking the phone to home\n");
	}


	public void home() {
		
		System.out.println("Going to home Screen");
	}

	
	public void turnOn() {
		
		System.out.println("Turning screen on device still locked");
	}
	
	

}
