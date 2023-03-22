package CalculatorProject;

public class Calculator {
	// Square function
	public int Square(int num)
	{
	    return num*num;
	}

	// Add two integers and returns the sum
	public int Add(int num1, int num2 )
	{
	    return num1 + num2;
	}

	// Add two integers and returns the sum
	public double Add(double num1, double num2 )
	{
	    return num1 + num2;
	}
	
	public int Add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	// Multiply two integers and retuns the result... this code is buggy on purpose
	public int Multiply(int num1, int num2 )
	{
	        return num1 * num2;
	}

	public int Divide(int num1, int num2 )
	{
	    return num1 / num2;
	}

	// Subtracts small number from big number
	public int Subtract(int num1, int num2 )
	{
	    if ( num1 > num2 )
	    {
	    return num1 - num2;
	    }
	    return num2 - num1;
	    }
	
	public int Subtract(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
}
