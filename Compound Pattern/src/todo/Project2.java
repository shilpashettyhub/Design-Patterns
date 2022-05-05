package todo;

import java.util.ArrayList;

public class Project2 implements IToDoList{
    
	String title;
	ArrayList<IToDoList> todos;
	
	public Project2(String title, ArrayList<IToDoList> todos) {
		super();
		this.title = title;
		this.todos = todos;
	}

	@Override
	public String GetList() {
		// TODO Auto-generated method stub
		
		String text=" ";
		text = text + this.title + " ";
		for(IToDoList t1: this.todos) {
			text = text + "\n"+ " ";
			text = text + t1.GetList();
			text = text + "\n"+ " ";
		
		}
		text = text + " ";
		return text;
	}

}
