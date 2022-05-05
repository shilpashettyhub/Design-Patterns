package iteratorpattern;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		AnimalSet1 animalSet1 = new AnimalSet1();
		AnimalSet2 animalSet2 = new AnimalSet2();
		Zoo z = new Zoo(animalSet1, animalSet2);
		
		z.showAnimals();
	}
}
