package command;

public class TurnTvOn implements Command{
	
	ElectronicDevice device;

	public TurnTvOn(ElectronicDevice electronicDevice) {
		super();
		this.device = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.device.on();
		
	}
	

}
