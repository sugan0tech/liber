package panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel implements PanelService {
	private Panel panel;
	private Label label;
	private Label nameLabel;
	private Label passwordLabel;
	private TextField userNameField;
	private TextField userPasswordField;
	private Button submitButton;
	public LoginPanel() {
		panel = new Panel(); 
		panel.setBackground(Color.green);
		panel.setBounds(20, 20, 960, 940);
		label = new Label("Login");
		label.setBounds(20, 20, 100, 20);
		
		nameLabel = new Label("Enter the user name :");
		nameLabel.setBounds(20, 80, 200, 25);
		
		userNameField = new TextField();
		userNameField.setBounds(20, 100, 200, 25);
		
		passwordLabel = new Label("Enter the password :");
		passwordLabel.setBounds(20, 120, 200, 25);

		userPasswordField = new TextField();
		userPasswordField.setBounds(20, 140, 200, 25);
		
		submitButton = new Button("Login");
		submitButton.setBounds(140, 200, 60, 25);
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Login button triggered");
				
			}
		});
		

		panel.add(label);
		panel.add(nameLabel);
		panel.add(passwordLabel);
		panel.add(userNameField);
		panel.add(userPasswordField);
		panel.add(submitButton);
		panel.setLayout(null);
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
