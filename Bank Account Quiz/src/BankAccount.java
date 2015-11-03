
public class BankAccount
	{
	private double myBalance;
	
	public BankAccount()
		{
		myBalance=0;
		}
	public BankAccount(double balance)
		{
		myBalance = balance;
		}
	public void deposit(double amount)
		{
		myBalance+=amount;
		System.out.println(myBalance);
		}
	public void withdraw(double amount)
		{
		myBalance-=amount;
		System.out.println(myBalance);
		}
	public double getBalance()
		{
		return myBalance;
		}
	}