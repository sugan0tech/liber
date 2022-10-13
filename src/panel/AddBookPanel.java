package panel;
import repository.BookRepository;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;


public class AddBookPanel implements PanelService {

	private Panel panel;
	private TextField isbnTextField;
	private TextField name;
	private TextField author;
	private TextField publishedYear;
	private TextField stock;
	private Label isbnLabel;
	private Label nameLabel;
	private Label authorLabel;
	private Label publishedYearLabel;
	private Label stockLabel;
	private Button button;

	public AddBookPanel() {
		panel = new Panel(); 
		panel.setBackground(Color.decode("#D8D9CF"));
		panel.setBounds(0, 160, 960, 940);
		panel.setLayout(null);
		
		isbnLabel = new Label("ISBN Number");
		isbnLabel.setBounds(100, 90, 100, 20);
		isbnTextField = new TextField();
		isbnTextField.setBounds(210,90,200,30);
		
		nameLabel = new Label("Book Title");
		nameLabel.setBounds(100, 130, 100, 20);
		name = new TextField();
		name.setBounds(210,130,200,30);
		
		authorLabel = new Label("Book Author");
		authorLabel.setBounds(100, 170, 100, 20);
		author = new TextField();
		author.setBounds(210,170,200,30);
		
		publishedYearLabel = new Label("Published Year");
		publishedYearLabel.setBounds(100, 210, 100, 20);
		publishedYear = new TextField();
		publishedYear.setBounds(210,210,200,30);
		
		stockLabel = new Label("Stock");
		stockLabel.setBounds(100, 250, 100, 20);
		stock = new TextField();
		stock.setBounds(210,250,200,30);
		
		button = new Button("Submit");
		button.setBounds(300,290, 100,30);
		button.setVisible(true);
		button.addActionListener(event -> {
	    	  BookRepository bookRepository = new BookRepository();
	    	  bookRepository.addBook(isbnTextField.getText(), name.getText(), author.getText(), publishedYear.getText(),stock.getText());
		}); 
        
		panel.add(isbnLabel);
		panel.add(isbnTextField);
		panel.add(nameLabel);
		panel.add(name);
		panel.add(authorLabel);
		panel.add(author);
		panel.add(publishedYearLabel);
		panel.add(publishedYear);
		panel.add(stockLabel);
		panel.add(stock);
		panel.add(button);
		
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}
}
