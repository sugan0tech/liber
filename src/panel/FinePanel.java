package panel;


import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.text.SimpleDateFormat;  
import java.text.ParseException;   
import java.util.Date;

import repository.LiberMainJDBC;
import repository.StudentRepository;

public class FinePanel implements PanelService {
	private Panel panel;
	private Label noLabel;
	private Label nameLabel;
	private Label issueLabel;
	private Label issuedateLabel;
	private Label returnLabel;
	private Label returndateLabel,fineLabel,fineamt;
	private Button button;
	
	public FinePanel(String roll_no) throws Exception{
		StudentRepository obj=new StudentRepository(new LiberMainJDBC());
		String dates[]=obj.getReturnDate(roll_no);
		panel = new Panel(); 
		panel.setBackground(Color.decode("#D8D9CF"));
		panel.setBounds(0, 160, 960, 940);
		
		noLabel = new Label("Roll.no:");
		noLabel.setBounds(20, 100, 80, 20);
		panel.add(noLabel);
		panel.setLayout(null);
		
		nameLabel = new Label(roll_no);
		nameLabel.setBounds(110, 100, 80, 20);
		panel.add(nameLabel);
		
		issueLabel = new Label("Issue Date");
		issueLabel.setBounds(20, 130, 80, 20);
		panel.add(issueLabel);
		
		issuedateLabel = new Label(dates[0]);
		issuedateLabel.setBounds(110, 130, 80, 20);
		panel.add(issuedateLabel);
		
		returnLabel = new Label("Return Date");
		returnLabel.setBounds(20, 160, 80, 20);
		panel.add(returnLabel);
		
		returndateLabel = new Label(dates[1]);
		returndateLabel.setBounds(110, 160, 80, 20);
		panel.add(returndateLabel);
		
		SimpleDateFormat dte = new SimpleDateFormat("yyyy-MM-dd");
        try {   
        	long fine_amt=0;
        	Date date = new Date();  
            Date date1 = dte.parse(dte.format(date));   
            System.out.println(date1);
            Date date2 = dte.parse(dates[1]);   
            System.out.println(date2);
            long time_difference = date1.getTime() - date2.getTime();  
            long days_difference = (time_difference / (1000*60*60*24)); 
            System.out.println(days_difference);
            long fine_per_day = 5;
            if(days_difference<0) {
            	fine_amt=0;
            }else {
            	fine_amt=fine_per_day*days_difference;
            }
            fineLabel=new Label("Fine Amount ");
            fineLabel.setBounds(20,190,80,20);
            panel.add(fineLabel);
            
            fineamt=new Label("Rs. "+Long.toString(fine_amt));
            fineamt.setBounds(110,190,80,20);
            panel.add(fineamt);
            
        }  
        catch (ParseException excep) {   
            excep.printStackTrace();   
        }   
		
		button=new Button("Clear");
		button.setBounds(20,220,60,20);
		panel.add(button);
		button.addActionListener(
		    event -> {  
		    	
		    	obj.clear(roll_no);
		    	
	        }    
	    );  
		
		
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
