package Abstract;

abstract class bankaccount
{
	double account_number=12345678;
	double balance=500000;
	
	abstract void deposit();
	abstract void withdraw();
	
	public double getaccount_number()
	{
		return account_number;
	}
	
	public double getbalance()
	{
		return balance;
	}
	
}

class CheckingAccount extends bankaccount
{
	void deposit(double amount)
	{
		double new_balance=getbalance()+amount;
		System.out.println("THe Deposited amount is :"+amount);
	}

	@Override
	void deposit() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	void withdraw() 
	{
		// TODO Auto-generated method stub
		
	}
	
	void withdraw(double amount)
	{
		double new_balance=getbalance()-amount;
		System.out.println("The withdrawled amount is:"+amount);	
	}
	
}

public class question2
{
	public static void main(String args[])
	{	
		CheckingAccount ca=new CheckingAccount();
		ca.deposit(500);
		ca.withdraw(200);
	}
}
