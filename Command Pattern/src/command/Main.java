package command;

public class Main {
	
	public static void main(String[] args) {
		
		ElectronicDevice device1 = new Television();
		TurnTvOn onCommand = new TurnTvOn(device1);
		DeviceButton onPressed1 = new DeviceButton(onCommand);
		onPressed1.press();
		
		TurnTvOff offCommand = new TurnTvOff(device1);
		DeviceButton onPressed2 = new DeviceButton(offCommand);
		onPressed2.press();
		
		TurnVolumeUp volUpCommand = new TurnVolumeUp(device1);
		DeviceButton onPressed3 = new DeviceButton(volUpCommand);
		onPressed3.press();
		onPressed3.press();
		onPressed3.press();
		onPressed3.press();
		
		TurnVolumeDown volDownCommand = new TurnVolumeDown(device1);
		DeviceButton onPressed4 = new DeviceButton(volDownCommand);
		onPressed4.press();
		onPressed4.press();
	}

}
