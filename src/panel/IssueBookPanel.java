package panel;


import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.PopupMenu;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;

public class IssueBookPanel implements PanelService{
		    
		    private Panel panel;
			private Label title,id;
			private TextField t;
		    private Button b;
		    
		    public 	IssueBookPanel(){
		    	
		    	Font titleFont = new Font("arial",Font.BOLD,25);
		        Font labelFont = new Font("arial",Font.PLAIN,18);
		        Font textFont = new Font("arial",Font.PLAIN,18);

		    	
		    	Color formColor = new Color(224, 255, 255);
		    	panel = new Panel();
		        panel.setBackground(formColor);
				panel.setBounds(20, 20, 960, 940);
				
				title = new Label("LIBER");
				title.setFont(titleFont);
				title.setForeground(Color.BLUE);
				panel.add(title);
				
				id = new Label("Student ID");
				id.setFont(textFont);
		        id.setForeground(Color.GRAY);
				panel.add(id);
				
				t = new TextField(20);
				panel.add(t);

		        b = new Button("Check");
		        b.setFont(labelFont);
		        b.setForeground(Color.BLUE);
		        panel.add(b);
		        
		        title.setBounds(100, 40, 400, 50);
		        id.setBounds(70,90,90,60);
		        t.setBounds(180,100,150,30);
		        b.setBounds(160,150,70,40);
				panel.setLayout(null);
				
				PopupMenu popupmenu = new PopupMenu("Edit"); 

		        MenuItem cut = new MenuItem("Verified Successfully");  
		        cut.setActionCommand("Verified Successfully");
		        b.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
		                popupmenu.show(panel, 20, 20); 
					}
				});
		        panel.addMouseListener(new MouseAdapter() {  
		            public void mouseClicked(MouseEvent e) {              
		                popupmenu.show(panel, e.getX(), e.getY()); 
		            }                 
		        });  
		        panel.add(popupmenu)		;  
			}

			@Override
			public Panel getPanel() {
				return this.panel;
			}
}

