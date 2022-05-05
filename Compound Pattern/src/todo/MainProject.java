package todo;

import java.util.ArrayList;

public class MainProject implements IToDoList{
    
	String title;
	ArrayList<IToDoList> todos;
	
	public MainProject(String title, ArrayList<IToDoList> todos) {
		super();
		this.title = title;
		this.todos = todos;
	}

	@Override
	public String GetList() {
		// TODO Auto-generated method stub
		
		String text="";
		text = text + this.title + " ";
		for(IToDoList t1: this.todos) {
			text = text + "\n"+ " ";
			text = text + t1.GetList();
			text = text + "\n"+ "";
		
		}
		text = text + " ";
		return text;
	}

}