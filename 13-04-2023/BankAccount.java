package Interface_eg;

public interface BankAccount 
{
	void deposit();
	void withdraw();
	
	public static void main(String args[])
	{
		CheckingAccount ca=new CheckingAccount();
		ca.deposit();
		ca.withdraw();
	}
}

class CheckingAccount implements BankAccount
{
	@Override
	public void deposit() 
	{
		System.out.println("The deposited amount is :-500.0");
	}

	@Override
	public void withdraw() 
	{
		System.out.println("The withdrawled amount is :-200.0");
		
	}
}
