package panel;


import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.*;

import main.LiberManagementSystem;
import repository.LiberMainJDBC;
import repository.StudentRepository;

public class CheckStudentPanel implements PanelService{
		    
		    private Panel panel;
			private Label title;
			private Label id;
			private Label label;
			private TextField textField;
		    private Button button;
		    public 	CheckStudentPanel(LiberManagementSystem liberManagementSystem){
		    	
		    	
		    	panel = new Panel();
		        panel.setBackground(Color.decode("#FF8787"));
				panel.setBounds(20, 20, 960, 940);
				panel.setLayout(null);
				
				if(liberManagementSystem.getFlag()) {
				title = new Label("Student Check");
		        title.setBounds(20, 40, 50, 30);
				
				id = new Label("Student ID");
		        id.setBounds(20,100,100,30);
				
				textField = new TextField();
		        textField.setBounds(120,100,150,30);

		        button = new Button("Check");
		        button.setBounds(220,130,50,30);
		        button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
						boolean status = new StudentRepository(new LiberMainJDBC()).contains(textField.getText());
						if(status) {
							panel.add(new FinePanel(textField.getText()).getPanel());
						}else {
							panel.add(new IssueBookPanel(new LiberMainJDBC()).getPanel());
						}
						}catch(Exception er) {
							System.out.println(er);
						}
					}
				});
				panel.add(title);
				panel.add(id);
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

