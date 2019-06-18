package Banking;

public class Bank {

		int accountNum = 9999;
		private int atmPin = 1234;
		int acctBalance = 1000;
		private int oatmPin;
		
		public void withdrawAccount(int accNum,int oatmPin, int withAmount)
		{
			if (accountNum==accNum && oatmPin==atmPin)
				{
					System.out.println("Accout and pin matched");
						if (acctBalance>withAmount)
						{
							acctBalance = acctBalance-withAmount;
							System.out.println("Amount Withdrawn is "+withAmount);
							System.out.println("The balance amount is "+acctBalance);
						}else
						{
							System.out.println("Insufficient Balance");
						}
				}
						else
						{
							System.out.println("Invalid Credentials");
						}
			}
		
			
		public void changePin(int accNum,int oatmPin, int natmPin)
		{
			if(accNum==accountNum && atmPin==oatmPin)
			{
				atmPin=natmPin;
				System.out.println("Pin Changed Successfully");
			}
			else
			{
				System.out.println("The Pin doesn't match");
			}
		}
}
