package proxypattern;

public class BookParser implements IBookParser{
	
	private String Book;
	private int NoOfPages;
	public BookParser() {}
	public BookParser(String Book) {
		this.Book = Book;
		//expensive parsing
		this.NoOfPages = 50;
	}

	@Override
	public int getNoOfPages() {
		// TODO Auto-generated method stub
		return this.NoOfPages;
		
	}

}
