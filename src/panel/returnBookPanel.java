package panel;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class returnBookPanel implements PanelService{

	private Panel panel;
	private Label label;
	private Button button;
	private TextField textField;
	public returnBookPanel() {
		panel = new Panel(); 
		panel.setBackground(Color.gray);
		panel.setBounds(20, 20, 960, 940);
		label = new Label("Enter your Roll.no:");
		label.setBounds(20, 20, 100, 20);
		panel.add(label);
		panel.setLayout(null);
		
		textField=new TextField();
		textField.setBounds(200,20,200,20);
		panel.add(textField);
		
		button=new Button("Enter");
		button.setBounds(50,50,60,20);
		panel.add(button);
		button.addActionListener(new ActionListener() {    
		    public void actionPerformed (ActionEvent e) {  
		    	if(textField.getText().equals("145")) {
		    		System.out.println("All clear");
		    	}
		    	else {
		    	panel.add(new finePanel().getPanel());
		    	}
	        }    
	    });  
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}

}
