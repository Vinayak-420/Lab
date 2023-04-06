package Lab;

class Person //class person as a parent class
{
    String name;
    int age;
    
    public Person(String name, int age) //passing the parameters in person constructor
    {
        this.name = name;
        this.age = age;
    }
    
    public void speak() //speak method
    {
        System.out.println("My name is " + this.name + " and my age is " + this.age + "  ");
    }
}

class stud extends Person
{
    int grade;
    
    public stud(String name, int age, int grade)//passing the parameters in stud constructor
    {
        super(name, age);
        this.grade = grade;
    }
    
    public void Study()//study method
    {
        System.out.println("My grade is " + this.grade + " ");
    }
}

public class Question2//main class
{
	  public static void main(String[] args)//main method 
	  {
	        stud mystud = new stud("vnk", 21, 10);//creating object
	        mystud.speak();//calling the method with object 
	        mystud.Study();//calling the method with object 
	        
	  }
}
