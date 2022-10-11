package panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.LiberManagementSystem;
import repository.bookRepository;


public class ManageBookPanel implements PanelService {
	private Panel panel;
	private Label label;
	private TextField tf;
	bookRepository obj = new bookRepository();
	public ManageBookPanel(LiberManagementSystem liberManagementSystem) {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#E26868"));
		panel.setBounds(20, 20, 960, 940);
		panel.setLayout(null);
		if(liberManagementSystem.getFlag()) {
		label = new Label("Enter ISBN Number");
		label.setBounds(100, 70, 100, 20);
		panel.add(label);
		
		tf = new TextField();
		tf.setBounds(100,90,200,30);
		panel.add(tf);
		
		Button button = new Button("Submit");
		button.setBounds(350,90, 100,30);
		button.setVisible(true);
		
		button.addActionListener(new ButtonClickListener()); 
        
		panel.add(button);
		}
		else {
			Label label = new Label("Please Log in to access the features!");
			label.setBounds(20, 50, 300, 50);
			panel.add(label);
		}
		
		
	}
	private class ButtonClickListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	    	  if(obj.checkBook(tf.getText()))
	    		  panel.add(new UpdateBookPanel(tf.getText()).getPanel());
	    	  else
	    		  panel.add(new AddBookPanel().getPanel());
	      }		
	   }

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
