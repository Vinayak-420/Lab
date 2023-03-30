package Lab;
public class Student 
{
	String name;
	int rollno;
	
	 Student()	//Default Constructor
	{
		name="Vnk";
		rollno=1;
		
	}
	
	Student(String n,int r)//parameterized Constructor
	{
		name=n;
		rollno=r;	
	}
	
	public void show()//declaring method
	{
		System.out.println("Student name is  "+name+" and rollno is "+rollno);
	}
	
	public static void main(String args[])	//main method
	{
		System.out.println("\n\tDefault Constructor");
		Student s=new Student();//creating object
		s.show();//calling method
		System.out.println("\n\tParameterized Constructor");
		Student s1=new Student("Nik",2);//creating object
		s1.show();//calling method
	}
}
