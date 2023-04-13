package Interface_eg;

public interface Person 
{
	void speak();
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.speak();
		Teacher t = new Teacher();
		t.speak();
	}
}

class Student implements Person
{
	public void speak()
	{
		System.out.println("I am a student");
	}
}

class Teacher implements Person 
{
	public void speak()
	{
		System.out.println("I am a teacher");
	}
}


