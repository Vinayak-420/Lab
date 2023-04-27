package Abstract;

abstract class shape1 //creating abstract class called as shape1
{
	abstract void  calculateArea();//creating abstract method called as calculateArea()
}

class Circle extends shape1 //creating subclass circle that is extending abstract clss shape1
{
	float pai=3.14f,r=6;//declaring variables
	
	void calculateArea()//declaring method
	{
		float a=pai*(r*r);//calcultaing area of circle
		System.out.println("The area of the circle is :"+a);
	}
}

class Rectangle2 extends shape1 //creating subclass Rectangle2 that is extending abstract clss shape1
{
	int l=6,w=7;//declaring variables
	void calculateArea()//declaring method
	{
		int b=l*w;//calcultaing area of rectangle
		System.out.println("The area of the rectangle is :"+b );
	}
}
public class question1 //main class
{
	public static void main(String args[])//main method
	{
		Circle c=new Circle(); //creating object of circle class
		c.calculateArea();//calling the method of circle class
		Rectangle2 r=new Rectangle2();//creating object of Rectangle class
		r.calculateArea();//calling the method of rectangle class
	}
}
