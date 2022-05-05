package statepattern;

public abstract class State {
	
	protected Phone phone;
	
	public State(Phone phone) {
		super();
		this.phone = phone;
	}
	public abstract void onHome();
	public abstract void onOffOn();

}
