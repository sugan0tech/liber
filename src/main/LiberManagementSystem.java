package main;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import panel.LoginPanel;
import panel.Sample;

public class LiberManagementSystem {

	private static boolean sessionFlag = false;
	

	public static void main(String[] args) {
		Frame frame = new Frame();
		// sample panel will be removed
		
		MenuBar bar = new MenuBar();
		Menu login = new Menu("login");
		bar.add(login);
		Menu bookManager = new Menu("book Manager");
		bar.add(bookManager);
		Menu bookIssue = new Menu("book issue");
		bar.add(bookIssue);
		Menu bookReturn = new Menu("book Return");
		MenuItem item = new MenuItem("Test check");
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Panel comp = (Panel) frame.getComponentAt(20, 20);
				frame.remove(comp);
				frame.add(new LoginPanel().getPanel());
				
			}
		});
		bookReturn.add(item);
		bar.add(bookReturn);

		frame.add(new Sample().getPanel());
		
		// set border size as 20 for each panel
		frame.setSize(1000, 1000);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Liber");
		frame.setMenuBar(bar);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
	}
}