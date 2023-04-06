package Lab;

class Vehicle //class
{
    String brand;
    String model;
    int year;
    
    public Vehicle(String brand, String model, int year) //passing the parameters in vehicle constructor
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void drive()//drive method 
    {
    	System.out.println("In drive method ");
        System.out.println( this.brand + " " + this.model + " (" + this.year + ") is driving ");
    }
}

class Car extends Vehicle //car class extending vehicle class
{
    String color;
    
    public Car(String brand, String model, int year, String color)//passing the parameters in car constructor
    {
        super(brand, model, year);
        this.color = color;
    }
    
    public void honk()//honk method
    {
    	System.out.println("In Honk method ");
        System.out.println(this.brand + " " + this.model + " (" + this.year + ") is honking ");
    }
}

public class Question1 //main class
{
	public static void main(String[] args)//main method 
	{
        Car myCar = new Car("Maruti", "swift", 2022, "Blue");//creating object
        myCar.drive();//calling the method with object 
        myCar.honk();//calling the method with object 
	}
}
