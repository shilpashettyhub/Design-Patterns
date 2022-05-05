package command;

public class TurnVolumeUp implements Command{
	
	ElectronicDevice device;

	public TurnVolumeUp(ElectronicDevice electronicDevice) {
		super();
		this.device = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.device.volumeUp();;
		
	}
	

}
