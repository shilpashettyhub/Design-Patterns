
public class Singleton {
	
	private static int objCreated = 0;
	private String name = "Singleton";
	private static Singleton s;
	
	private Singleton() {
		System.out.println("creating a new object");
		objCreated++;
	}
	
	
	public static Singleton getObject() {
		
		if(objCreated == 1) {
			
			return s;
			
		}
		s = new Singleton();
		return s;
	}


	public String getName() {
		return name;
	}


	public static int getObjCreated() {
		return objCreated;
	}

	

}
