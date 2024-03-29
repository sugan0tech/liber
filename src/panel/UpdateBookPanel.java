package panel;

import repository.BookRepository;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;



public class UpdateBookPanel implements PanelService {
	private Panel panel;
	private Label ISBN;
	private TextField stock;
	BookRepository obj = new BookRepository();
	public UpdateBookPanel(String ISBN_Number) {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#D8D9CF"));
		panel.setBounds(0, 160, 960, 940);
		panel.setLayout(null);
		
		Label ISBNLabel = new Label("ISBN Number:");
		ISBNLabel.setBounds(100, 90, 100, 20);
		panel.add(ISBNLabel);
		ISBN = new Label(ISBN_Number);
		ISBN.setBounds(210, 90, 100, 20);
		panel.add(ISBN);
		
		Label NameLabel = new Label("Book Title:");
		NameLabel.setBounds(100, 130, 100, 20);
		panel.add(NameLabel);
		Label Name = new Label(obj.getBookName(ISBN_Number));
		Name.setBounds(210, 130, 100, 20);
		panel.add(Name);
		
		Label stockLabel = new Label("Stock");
		stockLabel.setBounds(100, 170, 100, 20);
		panel.add(stockLabel);
		stock = new TextField();
		stock.setBounds(210,170,100,30);
		panel.add(stock);
		
		Button button = new Button("Submit");
		button.setBounds(320,170, 100,30);
		button.setVisible(true);
		
		button.addActionListener(event -> 
	    	  obj.updateStock(ISBN.getText(), stock.getText())
		); 
        
		panel.add(button);
		
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
