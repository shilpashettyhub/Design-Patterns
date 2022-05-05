package iteratorpattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AnimalSet1 implements IIterator{
	
	Set<String> animals;
	
	public AnimalSet1() {
		
		animals = new HashSet<String>();
		
		animals.add("Elephant");
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Goat");
		animals.add("Deer");
		animals.add("Cat");
		
	}
	
	public HashSet<String> getAnimals(){
		return (HashSet<String>) animals;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return animals.iterator();
	}
	
	

}
