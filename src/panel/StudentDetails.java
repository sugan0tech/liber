package panel;

import java.awt.*;

public class StudentDetails implements PanelService{
		    
		    private Panel panel;
			private Label title;
			private Label studentId;
			private Label bookId;
			private Label dateOfIssue;
			private Label dueDate;
			private TextField textFieldOne;
			private TextField textFieldTwo;
			private TextField textFieldThree;
			private TextField textFieldFour;
		    private Button b;
		    
		    public StudentDetails(){
		    	

		    	
		    	Color formColor = new Color(224, 255, 255 );
		    	panel = new Panel();
		        panel.setBackground(formColor);
				panel.setBounds(20, 20, 960, 940);
				
				title = new Label("LIBER");
				title.setForeground(Color.BLUE);
				
				panel.add(title);
				
				studentId = new Label("Student ID");
				studentId.setForeground(Color.GRAY);
				
				
				bookId = new Label("Book ID");
				bookId.setForeground(Color.GRAY);
								
				dateOfIssue = new Label("Date Of Issue");
				dateOfIssue.setForeground(Color.GRAY);

				dueDate = new Label("Due Date");
				dueDate.setForeground(Color.GRAY);
	
				textFieldOne = new TextField(20);
				textFieldTwo = new TextField(20);
				textFieldThree = new TextField(20);
				textFieldFour = new TextField(20);

		        b = new Button("Submit");
		        b.setForeground(Color.BLUE);
		        
				
		        title.setBounds(100, 40, 400, 50);
		        studentId.setBounds(70,80,90,60);
		        textFieldOne.setBounds(250,100,150,30);
		        bookId.setBounds(70,130,90,60);
		        textFieldTwo.setBounds(250,150,150,30);
		        dateOfIssue.setBounds(70,180,140,60);
		        textFieldThree.setBounds(250,200,150,30);					
		        dueDate.setBounds(70,230,90,60);
		        textFieldFour.setBounds(250,250,150,30);
		        b.setBounds(70,290,50,30);
		        
		        panel.add(studentId);
				panel.add(textFieldOne);
				panel.add(bookId);
				panel.add(textFieldTwo);
				panel.add(dateOfIssue);
				panel.add(textFieldThree);
				panel.add(dueDate);
				panel.add(textFieldFour);
				panel.add(b);
				
				panel.setLayout(null);
				
			}

			@Override
			public Panel getPanel() {
				return this.panel;
			}

}