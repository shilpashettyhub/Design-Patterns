package command;

public class TurnTvOff implements Command{
	
	ElectronicDevice device;

	public TurnTvOff(ElectronicDevice electronicDevice) {
		super();
		this.device = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.device.off();
		
	}
	

}
