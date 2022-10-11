package panel;

import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Font;
public class Sample implements PanelService {
	private Panel panel;
	private Label label;
	public Sample() {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#FF8787"));
		panel.setBounds(20, 20, 960, 940);
		
		label = new Label("Welcome to LIBER");
		label.setBounds(20, 40, 500, 20);
		panel.add(label);
		
		Label desc = new Label("Library Management System");
		desc.setBounds(20, 65, 500, 20);
		panel.add(desc);
		Font myFont = new Font("Serif",Font.ITALIC,15);
		desc.setFont(myFont);
		
		Font myFont1 = new Font("Serif",Font.BOLD,22);
		label.setFont(myFont1);
		
		panel.setLayout(null);
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}

}
