package statepattern;

public class OffState extends State{

	public OffState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onHome() {
		// TODO Auto-generated method stub
		phone.setState(new LockedState(phone));
		phone.turnOn();
	}

	@Override
	public void onOffOn() {
		// TODO Auto-generated method stub
		phone.setState(new LockedState(phone));
	    phone.turnOn();
	}
	
	

}
