package main;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import panel.Sample;

public class LiberManagementSystem {
	public static void main(String[] args) {
		Frame frame = new Frame();
		// sample panel will be removed
		frame.add(new Sample().getPanel());
		
		MenuBar bar = new MenuBar();
		Menu login = new Menu("login");
		bar.add(login);
		
		// set border size as 20 for each panel
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Liber");
		frame.setMenuBar(bar);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
	}
}