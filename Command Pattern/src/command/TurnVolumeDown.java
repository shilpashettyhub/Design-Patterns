package command;

public class TurnVolumeDown implements Command{
	
	ElectronicDevice device;

	public TurnVolumeDown(ElectronicDevice electronicDevice) {
		super();
		this.device = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.device.volumeDown();;
		
	}
	

}
