package panel;

import java.awt.Color;


import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ReturnBookPanel implements PanelService{

	private Panel panel;
	private Label label;
	private Button button;
	private TextField textField;
	public ReturnBookPanel() {
		//StudentRepository obj=new StudentRepository();
		panel = new Panel(); 
		panel.setBackground(Color.gray);
		panel.setBounds(20, 20, 960, 940);
		label = new Label("Enter your Roll.no:");
		label.setBounds(20, 80, 100, 20);
		panel.add(label);
		panel.setLayout(null);
		
		textField=new TextField();
		textField.setBounds(200,80,200,20);
		panel.add(textField);
		
		button=new Button("Enter");
		button.setBounds(50,150,60,20);
		panel.add(button);
		button.addActionListener(new ActionListener() {    
		    public void actionPerformed (ActionEvent e) {  
		    	
		    	panel.add(new FinePanel(textField.getText()).getPanel());
		    	
	        }    
	    });  
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}

}
