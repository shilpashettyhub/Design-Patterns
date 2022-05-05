package iteratorpattern;

import java.util.Iterator;

public class Zoo {
	
	AnimalSet1 animalset1;
	AnimalSet2 animalset2;
	public Zoo(AnimalSet1 animalset1, AnimalSet2 animalset2) {
		
		this.animalset1 = animalset1;
		this.animalset2 = animalset2;
	}
	
	public void showAnimals() {
		
		Iterator animalset1 = this.animalset1.createIterator();
		Iterator animalset2 = this.animalset2.createIterator();
		
		System.out.println("Animal set one : ");
		printAnimals(animalset1);
		
		System.out.println("Animal set two : ");
		printAnimals(animalset2);
		
	}
	
	public void printAnimals(Iterator iterator) {
		
		while (iterator.hasNext()) {
			
			String animal = (String) iterator.next();
			
			System.out.println(animal);
		}
		
	}


}
