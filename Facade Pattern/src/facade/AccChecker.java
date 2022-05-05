package facade;

public class AccChecker {
	
	Account a;
	
	
	public AccChecker() {
		super();
		a = new Account();
	}


	public boolean checkaccno(String accNumber) {
		
		return (this.a.getAccNo().equals(accNumber));
		
	}

}
