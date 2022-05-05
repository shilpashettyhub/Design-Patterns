package command;

public class Television implements ElectronicDevice{
	
	private int volume;
	

	public Television() {
		super();
		this.volume = 0;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning TV On");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Turning TV Off");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Volume Up: "+(++volume));
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Volume Down: "+(--volume));
		
	}

}
