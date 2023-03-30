package Lab;

public class RectangleTest //creating class
{
	public static void main(String args[])//main method
	{
 Rectangle r=new Rectangle(40, 20);//creating object and passing parameters
 System.out.println("Area= "+r.calculate());//calling method
 
 Rectangle r1=new Rectangle(30, 30);//creating object and passing parameters
 System.out.println("New Area= "+r1.calculate());//calling method
	}
 
}
