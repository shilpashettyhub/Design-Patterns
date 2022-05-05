
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Before creation of object\nNumber of objects created : "+Singleton.getObjCreated());
		Singleton s1 = Singleton.getObject();
		System.out.println("After creation of first object\nNumber of objects created : "+Singleton.getObjCreated());
		Singleton s2 = Singleton.getObject();
		System.out.println("After creation of second object\nNumber of objects created : "+Singleton.getObjCreated());
		
		System.out.println("Name of the object s1 : "+s1.getName());
		System.out.println("Name of the object s2 : "+s2.getName());
		
	}

}
