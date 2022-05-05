package facade;

public class CvvChecker {
	
	Account a;

	public CvvChecker() {
		super();
		a = new Account();
	}
	
	public boolean checkcvv(String cvv) {
		
		return (this.a.getCvv().equals(cvv));
		
	}

}
