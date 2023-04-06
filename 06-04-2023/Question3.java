package Lab;

class Bank //class Bank parent class
{  
	float getRateOfInterest() //method with float return type
		{
			return 0;
		}  
}  

class SBI extends Bank //SBI class extending Bank class
{  
	float getRateOfInterest() //method with float return type
		{
			return 7.5f;//returning the value
		}
}

class ICICI extends Bank //ICICI class extending Bank class
{  
	float getRateOfInterest()//method with float return type
		{
			return 6.5f;//returning the value

		}  
}  

class AXIS extends Bank //AXIS class extending Bank class
{  
	float getRateOfInterest()//method with float return type
		{
			return 5.5f;//returning the value

		}  
}  

public class Question3 
{
	public static void main(String args[])
	{  
		SBI s=new SBI();  //creating object of sbi class
		ICICI i=new ICICI();  //creating object of icici class
		AXIS a=new AXIS();  //creating object of asix class
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  //calling the method with object 
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  //calling the method with object 
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  //calling the method with object 
	}  
}
