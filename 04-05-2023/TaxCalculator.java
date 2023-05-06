package Threads;

public class TaxCalculator 
{
	public double calculateTax(String empName,boolean isIndian,int empSal) throws Exception
	{
		if (!isIndian) 
		{
            throw new CountryNotValidException();
        }
        if (empName == null || empName.isEmpty()) 
        {
            throw new EmployeeNameInvalidException();
        }
        double taxAmount = 0;
        if (empSal > 100000)
        {
            taxAmount = empSal * 8 / 100;
        } 
        else if (empSal > 50000)
        {
            taxAmount = empSal * 6 / 100;
        } 
        else if (empSal > 30000) 
        {
            taxAmount = empSal * 5 / 100;
        } 
        else if (empSal > 10000) 
        {
            taxAmount = empSal * 4 / 100;
        } 
        else 
        {
            throw new TaxNotEligibleException();
        }
        return taxAmount;
	}

	
}
