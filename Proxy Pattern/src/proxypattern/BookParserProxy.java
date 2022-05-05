package proxypattern;

public class BookParserProxy extends BookParser implements IBookParser {
	
	private BookParser bookParser = null;
	private String Book;
	public BookParserProxy(String Book) {
		// TODO Auto-generated constructor stub
		super();
		this.Book = Book;
	}

	@Override
	public int getNoOfPages() {
		// TODO Auto-generated method stub
		
		if (bookParser == null) {
			System.out.println("object created");
			this.bookParser = new BookParser(this.Book);}
		else{
			System.out.println("Reusing the same object created last time");
		}
		return this.bookParser.getNoOfPages();	
	}
}
