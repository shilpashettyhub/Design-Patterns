package adapterpattern;

public class Adapter implements ITarget{
	
	private Adaptee adaptee;

	public Adapter() {
		super();
	}

	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		
		this.adaptee.specificRequest();
		
	}
	

}
