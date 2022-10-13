package panel;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import main.LiberManagementSystem;

public class ReturnBookPanel implements PanelService{

	private Panel panel;
	private Label label;
	private Button button;
	private TextField textField;
	public ReturnBookPanel(LiberManagementSystem liberManagementSystem) {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#E26868"));
		panel.setBounds(20, 20, 960, 940);
		panel.setLayout(null);

		if(liberManagementSystem.getFlag()) {
			label = new Label("Enter your Roll.no:");
			label.setBounds(20, 80, 100, 20);
		
			textField=new TextField();
			textField.setBounds(200,80,200,20);
		
			button=new Button("Enter");
			button.setBounds(50,120,60,20);
			button.addActionListener(
			    event ->  {  
			    	
			    	try {
			    	panel.add(new FinePanel(textField.getText()).getPanel());
			    	}catch(Exception er){
			    		System.out.println(er);
			    	}
			    	
	    	    }    
	    	);  
	
			panel.add(label);
			panel.add(textField);
			panel.add(button);
		}
		else {
			label = new Label("Please Log in to access the features!");
			label.setBounds(20, 50, 300, 50);
			panel.add(label);
		}
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}

}
