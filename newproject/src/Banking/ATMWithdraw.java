package Banking;

public class ATMWithdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		//System.out.println(b.atmPin);
		b.changePin(9999, 1234, 12324);
		b.withdrawAccount(9999, 12324, 100);
	}

}
