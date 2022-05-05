package proxypattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Book = "Heyyyyyyyyyyyyyyyyyyyyyyy";
		BookParserProxy b = new BookParserProxy(Book);
		System.out.println("The number of pages in the book is "+b.getNoOfPages());
		System.out.println("The number of pages in the book is "+b.getNoOfPages());
		System.out.println("The number of pages in the book is "+b.getNoOfPages());
	}

}
