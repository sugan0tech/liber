package panel;

import java.awt.*;
import java.awt.event.*;

public class StudentDetails implements PanelService{
		    
		    private Panel panel;
			private Label title,studentId,bookId,dateOfIssue,dueDate;
			private TextField t1,t2,t3,t4;
		    private Button b;
		    
		    public StudentDetails(){
		    	
		    	Font titleFont = new Font("arial",Font.BOLD,25);
		        Font labelFont = new Font("arial",Font.PLAIN,18);
		        Font textFont = new Font("arial",Font.PLAIN,18);

		    	
		    	Color formColor = new Color(224, 255, 255 );
		    	panel = new Panel();
		        panel.setBackground(formColor);
				panel.setBounds(20, 20, 960, 940);
				
				title = new Label("LIBER");
				title.setFont(titleFont);
				title.setForeground(Color.BLUE);
				
				panel.add(title);
				
				studentId = new Label("Student ID");
				studentId.setFont(textFont);
				studentId.setForeground(Color.GRAY);
				
				
				bookId = new Label("Book ID");
				
				bookId.setFont(textFont);
				bookId.setForeground(Color.GRAY);
								
				dateOfIssue = new Label("Date Of Issue");
				dateOfIssue.setFont(textFont);
				dateOfIssue.setForeground(Color.GRAY);

				dueDate = new Label("Due Date");
				dueDate.setFont(textFont);
				dueDate.setForeground(Color.GRAY);
	
				t1 = new TextField(20);
				t2 = new TextField(20);
				t3 = new TextField(20);
				t4 = new TextField(20);

		        b = new Button("Submit");
		        b.setForeground(Color.BLUE);
		        
				
		        title.setBounds(100, 40, 400, 50);
		        studentId.setBounds(70,80,90,60);
		        t1.setBounds(250,100,150,30);
		        bookId.setBounds(70,130,90,60);
		        t2.setBounds(250,150,150,30);
		        dateOfIssue.setBounds(70,180,140,60);
		        t3.setBounds(250,200,150,30);					
		        dueDate.setBounds(70,230,90,60);
		        t4.setBounds(250,250,150,30);
		        b.setBounds(70,290,50,30);
		        
		        panel.add(studentId);
				panel.add(t1);
				panel.add(bookId);
				panel.add(t2);
				panel.add(dateOfIssue);
				panel.add(t3);
				panel.add(dueDate);
				panel.add(t4);
				panel.add(b);
				
				panel.setLayout(null);
				
			}

			@Override
			public Panel getPanel() {
				return this.panel;
			}

}