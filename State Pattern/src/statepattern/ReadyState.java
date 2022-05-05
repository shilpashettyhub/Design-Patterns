package statepattern;

public class ReadyState extends State{

	public ReadyState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onHome() {
		// TODO Auto-generated method stub
		phone.home();
	}

	@Override
	public void onOffOn() {
		// TODO Auto-generated method stub
		phone.setState(new OffState(phone));
	    phone.lock();
	}

}
