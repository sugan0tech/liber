package panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.LiberManagementSystem;
import repository.LiberMainJDBC;
import repository.LoginRepository;


public class LoginPanel implements PanelService {
	private Panel panel;
	private Label label;
	private Label nameLabel;
	private Label passwordLabel;
	private TextField userNameField;
	private TextField userPasswordField;
	private Button submitButton;
	public LoginPanel(LiberManagementSystem liberManagementSystem) {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#FF8787"));
		panel.setBounds(20, 20, 960, 940);
		if(liberManagementSystem.getFlag()) {
			label = new Label("Already Logged In");
			label.setBounds(20, 50, 300, 50);
			panel.add(label);

		}else {
			label = new Label("Login");
			label.setBounds(20, 40, 100, 30);
		
			nameLabel = new Label("Enter the user name :");
			nameLabel.setBounds(20, 80, 200, 30);
		
			userNameField = new TextField();
			userNameField.setBounds(20, 110, 200, 30);
		
			passwordLabel = new Label("Enter the password :");
			passwordLabel.setBounds(20, 140, 200, 30);

			userPasswordField = new TextField();
			userPasswordField.setBounds(20, 170, 200, 30);
			
			submitButton = new Button("Login");
			submitButton.setBounds(140, 230, 60, 30);
			submitButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
	
						LoginRepository loginRepository = new LoginRepository();
						boolean flag =  loginRepository.Login(new LiberMainJDBC(), userNameField.getText(), userPasswordField.getText());
						liberManagementSystem.setFlag(flag);
						if(flag) {
							panel.removeAll();
							
							label = new Label("Logged in");
							label.setBounds(20, 20, 100, 30);
							panel.add(label);
						}
				}
			});
			
	
				panel.add(label);
				panel.add(nameLabel);
				panel.add(passwordLabel);
				panel.add(userNameField);
				panel.add(userPasswordField);
				panel.add(submitButton);
			}
		panel.setLayout(null);
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
