package todo;

public class ToDo implements IToDoList{
	
	String text;
	public ToDo(String text) {
		this.text = text;
	}
	@Override
	public String GetList() {
		// TODO Auto-generated method stub
		return " "+this.text;
	}
	
}
