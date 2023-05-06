package Threads;

public class CalculatorSimulator
{
	 public static void main(String[] args) 
	 {
	        TaxCalculator calculator = new TaxCalculator();
	        try 
	        {
	            double taxAmount = calculator.calculateTax("", true, 30000);
	            System.out.println("Tax amount is " + taxAmount);
	        } 
	        catch (CountryNotValidException e) 
	        {
	            System.out.println(" The employee should be an Indian citizen for calculating tax");
	            e.printStackTrace();
	        } 
	        catch (EmployeeNameInvalidException e) 
	        {
	            System.out.println(" The employee name cannot be empty");
	            e.printStackTrace();
	        } 
	        catch (TaxNotEligibleException e)
	        {
	            System.out.println(" The employee does not need to pay tax");
	            e.printStackTrace();
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	 }
}


//Test case 1:-"Ron", false, 34000
//output:-The employee should be an Indian citizen for calculating tax

//Test case2:-"Tim", true, 1000
//output:-The employee does not need to pay tax

//Test case 3:-"Jack", true, 55000
//Output:-Tax amount is 3300.0

//Test case 4:-"", true, 30000
//Output:-The employee name cannot be empty