package panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ManageBookPanel implements PanelService {
	private Panel panel;
	private Label label;
	private TextField tf;
	public ManageBookPanel() {
		panel = new Panel(); 
		panel.setBackground(Color.gray);
		panel.setBounds(20, 20, 960, 940);
		panel.setLayout(null);
		
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
	private class ButtonClickListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	    	  if(tf.getText().equals("12345"))
	    		  panel.add(new AddBookPanel().getPanel());
	    	  else
	    		  panel.add(new UpdateBookPanel().getPanel());
	      }		
	   }

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
