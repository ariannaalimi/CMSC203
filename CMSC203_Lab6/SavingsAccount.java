/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: Program uses inheritance to create a checking and savings account
 * Due: 11/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Arianna Alimi
*/

public class SavingsAccount extends BankAccount 
{
	private static final double rate = 0.025;
	private static int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, int balance)
	{
		super(name, balance);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + (savingsNumber);
		super.setAccountNumber(accountNumber);
	}
	
	public void postInterest()
	{
		 double monthlyRate = rate / 12;
		 
		 double total = getBalance() * monthlyRate;
		 
		 deposit(total);
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount originalSavings, double initialBalance)
	{
		super(originalSavings, initialBalance);
		
		savingsNumber++;
		
		String theAccount = super.getAccountNumber();
		
		String[] array = theAccount.split("-");
		
		String arrayAccount = array[0];
		
		
		accountNumber = arrayAccount + "-" + savingsNumber;
		super.setAccountNumber(accountNumber);
	}

}
