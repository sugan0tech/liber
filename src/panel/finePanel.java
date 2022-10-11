package panel;


import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;


public class finePanel implements PanelService {
	private Panel panel;
	private Label noLabel;
	private Label nameLabel;
	private Label issueLabel;
	private Label issuedateLabel;
	private Label returnLabel;
	private Label returndateLabel;
	
	public finePanel() {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#d8d9cf"));
		panel.setBounds(0, 160, 960, 940);
		
		noLabel = new Label("Roll.no:");
		noLabel.setBounds(20, 100, 80, 20);
		panel.add(noLabel);
		panel.setLayout(null);
		
		nameLabel = new Label("145");
		nameLabel.setBounds(110, 100, 80, 20);
		panel.add(nameLabel);
		
		issueLabel = new Label("Issue Date");
		issueLabel.setBounds(20, 130, 80, 20);
		panel.add(issueLabel);
		
		issuedateLabel = new Label("10/10/2022");
		issuedateLabel.setBounds(110, 130, 80, 20);
		panel.add(issuedateLabel);
		
		returnLabel = new Label("Return Date");
		returnLabel.setBounds(20, 160, 80, 20);
		panel.add(returnLabel);
		
		returndateLabel = new Label("10/10/2022");
		returndateLabel.setBounds(110, 160, 80, 20);
		panel.add(returndateLabel);
		
		
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
