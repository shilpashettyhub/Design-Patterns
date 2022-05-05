package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalSet2 implements IIterator{
	
ArrayList<String> animals;
	
	public AnimalSet2() {
		
		animals = new ArrayList<String>();
		
		animals.add("Dog");
		animals.add("Monkey");
		animals.add("Kola");
		animals.add("Panda");
		animals.add("Snake");	              
		animals.add("Gorilla");
		
	}
	
	public ArrayList<String> getAnimals(){
		return animals;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return animals.iterator();
	}
	
	

}
