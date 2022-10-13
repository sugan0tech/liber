package panel;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import main.LiberManagementSystem;


public class LogoutPanel implements PanelService {
	private Panel panel;
	
	public LogoutPanel(LiberManagementSystem liberManagementSystem) {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#FF8787"));
		panel.setBounds(20, 20, 960, 940);
		if(liberManagementSystem.getFlag()) {
			Label label = new Label("Successfully Logged Out!");
			label.setBounds(20, 50, 300, 50);
			panel.add(label);

		}else {
			Label label = new Label("Please Login!");
			label.setBounds(20, 50, 300, 50);
			panel.add(label);
				
			}
		panel.setLayout(null);
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
