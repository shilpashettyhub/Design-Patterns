package todo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		
		ToDo t1 = new ToDo("T1");
		ToDo t2 = new ToDo("T2");
		ToDo t3 = new ToDo("T3");
		ToDo t4 = new ToDo("T4");
		ToDo t5 = new ToDo("T5");
		ToDo t6 = new ToDo("T6");
		
		ArrayList<IToDoList> todos1 = new ArrayList<>();
		ArrayList<IToDoList> todos2 = new ArrayList<>();
		ArrayList<IToDoList> todos3 = new ArrayList<>();
		ArrayList<IToDoList> todos4 = new ArrayList<>();
		ArrayList<IToDoList> todos5 = new ArrayList<>();
		
		todos1.add(t1);
		todos1.add(t2);
		
		todos2.add(t3);
		todos2.add(t4);
		
		Project1 p1 = new Project1("project1", todos1);
		Project2 p2 = new Project2("project2", todos2);
		
		todos3.add(p1);
		todos3.add(p2);
		
		Project p = new Project("Project", todos3);
		
	    todos4.add(t5);
	    todos4.add(t6);
	    
		SecondProject sp = new SecondProject("Second Project", todos4);
		
		
		todos5.add(p);
		todos5.add(sp);
		
		MainProject mp = new MainProject("MainProject", todos5);
		
		System.out.println(mp.GetList());
				
	}

}
