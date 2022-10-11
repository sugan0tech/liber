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
import panel.ManageBookPanel;
import panel.ReturnBookPanel;
import panel.Sample;
import repository.LiberMainJDBC;
import repository.LoginRepository;

public class LiberManagementSystem {

	private static boolean sessionFlag = false;
	

	public static void main(String[] args) throws Exception {
		Frame frame = new Frame();
		// sample panel will be removed
		
		MenuBar bar = new MenuBar();
		Menu menu = new Menu("menu");
		MenuItem login = new MenuItem("login");
		menu.add(login);
		MenuItem bookManager = new MenuItem("book manager");
		menu.add(bookManager);
		MenuItem bookReturn = new MenuItem("return book");
		menu.add(bookReturn);
		MenuItem bookIssue = new MenuItem("book issue");
		menu.add(bookIssue);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Panel comp = (Panel) frame.getComponentAt(20, 20);
				frame.remove(comp);
				frame.add(new LoginPanel().getPanel());
				
			}
		});
		
		bookManager.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Panel comp = (Panel) frame.getComponentAt(20, 20);
				frame.remove(comp);
				frame.add(new ManageBookPanel().getPanel());
				
			}
		});
		bookReturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Panel comp = (Panel) frame.getComponentAt(20, 20);
				frame.remove(comp);
				frame.add(new ReturnBookPanel().getPanel());
				
			}
		});
		bar.add(menu);

		frame.add(new Sample().getPanel());
		
		LoginRepository test = new LoginRepository(new LiberMainJDBC(), "selva", "selva");
		
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