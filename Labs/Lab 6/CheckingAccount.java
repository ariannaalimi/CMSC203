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

public class CheckingAccount extends BankAccount
{

	private static final double FEE = 0.15;
	
	public CheckingAccount(String name, double initial)
	{
		super(name, initial);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public void setAccountNumber(String newNum)
	{
		super.setAccountNumber(newNum);
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		return super.withdraw(amount + FEE);
	}
}
