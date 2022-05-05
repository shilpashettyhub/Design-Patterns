package statepattern;

public class LockedState extends State{

	public LockedState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onHome() {
		// TODO Auto-generated method stub
		phone.setState(new ReadyState(phone));
		phone.unLock();
	}

	@Override
	public void onOffOn() {
		// TODO Auto-generated method stub
		phone.setState(new OffState(phone));
		phone.lock();
	}

}
