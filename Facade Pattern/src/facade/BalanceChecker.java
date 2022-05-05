package facade;

public class BalanceChecker {
	
	Account a;
	
	public BalanceChecker() {
		super();
		a = new Account();
	}

	public boolean checkbalance(Double balance) {
		
		return (this.a.getBalance()>= balance);
		
	}
	
	public void decreaseBalance(Double amt) {
		
		this.a.setBalance(this.a.getBalance()- amt);
		System.out.println("Amount of "+ amt+" is deducted from your account");
		System.out.println("Available Balance is "+ a.getBalance());
	}

}
