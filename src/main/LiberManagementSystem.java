package main;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LiberManagementSystem {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Liber");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
	}
}