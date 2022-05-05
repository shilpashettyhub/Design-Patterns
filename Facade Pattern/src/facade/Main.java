package facade;

public class Main {
	
	public static void main(String[] args) {
		
		WithdrawalFacade w = new WithdrawalFacade();
		w.withdraw("1234567891234", "322", 57000.00);

		
	}
	
	
}
