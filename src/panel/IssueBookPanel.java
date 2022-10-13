package panel;


import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.*;
import repository.LiberMainJDBC;
import repository.StudentRepository;

public class IssueBookPanel implements PanelService{

	private Panel panel;
	private TextField isbnTextField;
	private TextField rollNo;
	private TextField dueDate;
	public IssueBookPanel(LiberMainJDBC liberMainJDBC) {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#D8D9CF"));
		panel.setBounds(0, 160, 960, 940);
		panel.setLayout(null);
		
		Label ISBNLabel = new Label("ISBN Number");
		ISBNLabel.setBounds(100, 90, 100, 20);

		isbnTextField = new TextField();
		isbnTextField.setBounds(210,90,200,30);
		
		Label rollNoLabel = new Label("rollNo");
		rollNoLabel.setBounds(100, 130, 100, 20);

		rollNo = new TextField();
		rollNo.setBounds(210,130,200,30);
		
		Label dueDateLabel = new Label("dueDate");
		dueDateLabel.setBounds(100, 170, 100, 20);

		dueDate= new TextField();
		dueDate.setBounds(210,170,200,30);
		
		Button button = new Button("Submit");
		button.setBounds(300,290, 100,30);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StudentRepository studentRepository = new StudentRepository(liberMainJDBC);
					studentRepository.addStudent(rollNo.getText(), isbnTextField.getText(), dueDate.getText());
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		}); 
        
		panel.add(ISBNLabel);
		panel.add(isbnTextField);
		panel.add(rollNoLabel);
		panel.add(rollNo);
		panel.add(dueDateLabel);
		panel.add(dueDate);
		panel.add(button);
		
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}

