package panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

public class Sample implements PanelService {
	private Panel panel;
	private Label label;
	public Sample() {
		panel = new Panel(); 
		panel.setBackground(Color.green);
		panel.setBounds(20, 20, 960, 940);
		label = new Label("Sample Label");
		label.setBounds(20, 20, 100, 20);
		panel.add(label);
		Button btn = new Button("Sample Button");
		btn.setBounds(20, 40, 100, 20);
		panel.add(btn);
		panel.setLayout(null);
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}

}
