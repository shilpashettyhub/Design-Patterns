package facade;

public class WithdrawalFacade {
	
	AccChecker a;
	BalanceChecker b;
	CvvChecker c;
	
	public WithdrawalFacade() {
		
		// TODO Auto-generated constructor stub
		a = new AccChecker();
		b = new BalanceChecker();
		c = new CvvChecker();
		
		
	}

	public void withdraw(String AccNo, String cvv, Double amt) {
		
		if(a.checkaccno(AccNo) && b.checkbalance(amt) && c.checkcvv(cvv)) {
			
			System.out.println("Transaction Successfull!!");
			b.decreaseBalance(amt);
		}
		else
			System.out.println("Invalid credentials");
		
		
		
		
	}

}
