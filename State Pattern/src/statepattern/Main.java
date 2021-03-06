package statepattern;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame f=new JFrame("Button Example");  
		Phone phone = new Phone();
		
		JButton home = new JButton("home");
		home.addActionListener(e -> phone.getState().onHome());
		home.setBounds(50,100,95,30);  
	    f.add(home);
	    
		JButton onOff = new JButton("On/Off");
		onOff.addActionListener(e -> phone.getState().onOffOn());
		onOff.setBounds(50,50,95,30);  
	    f.add(onOff);
	    
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	    
//		phone.getState().onHome();
//		phone.getState().onOffOn();
//		phone.getState().onHome();
//		phone.getState().onOffOn();
		
		
	}

}
