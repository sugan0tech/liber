package panel;
import repository.bookRepository;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddBookPanel implements PanelService {
	private Panel panel;
	private TextField ISBN, name, author, publishedYear, stock;
	public AddBookPanel() {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#D8D9CF"));
		panel.setBounds(0, 160, 960, 940);
		panel.setLayout(null);
		
		Label ISBNLabel = new Label("ISBN Number");
		ISBNLabel.setBounds(100, 90, 100, 20);
		panel.add(ISBNLabel);
		ISBN = new TextField();
		ISBN.setBounds(210,90,200,30);
		panel.add(ISBN);
		
		Label NameLabel = new Label("Book Title");
		NameLabel.setBounds(100, 130, 100, 20);
		panel.add(NameLabel);
		name = new TextField();
		name.setBounds(210,130,200,30);
		panel.add(name);
		
		Label authorLabel = new Label("Book Author");
		authorLabel.setBounds(100, 170, 100, 20);
		panel.add(authorLabel);
		author = new TextField();
		author.setBounds(210,170,200,30);
		panel.add(author);
		
		Label publishedYearLabel = new Label("Published Year");
		publishedYearLabel.setBounds(100, 210, 100, 20);
		panel.add(publishedYearLabel);
		publishedYear = new TextField();
		publishedYear.setBounds(210,210,200,30);
		panel.add(publishedYear);
		
		Label stockLabel = new Label("Stock");
		stockLabel.setBounds(100, 250, 100, 20);
		panel.add(stockLabel);
		stock = new TextField();
		stock.setBounds(210,250,200,30);
		panel.add(stock);
		
		Button button = new Button("Submit");
		button.setBounds(300,290, 100,30);
		button.setVisible(true);
		
		button.addActionListener(new ButtonClickListener()); 
        
		panel.add(button);
		
		
	}
	private class ButtonClickListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	    	  
	    	  bookRepository obj = new bookRepository();
	    	  obj.addBook(ISBN.getText(), name.getText(), author.getText(), publishedYear.getText(),stock.getText());
	      }		
	   }

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
