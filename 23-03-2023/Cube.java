import java.util.Scanner;
public class Cube 
{
	public static void main(String args[])
	{
		int num;
		System.out.print("Enter a number :-");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("The cube of given number is :- "+(num*num*num));
	}
}
