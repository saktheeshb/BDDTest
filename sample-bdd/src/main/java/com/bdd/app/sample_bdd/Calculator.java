package com.bdd.app.sample_bdd;

/**
 * Hello world!
 *
 */
public class Calculator 
{
	int firstNumber;
	int secondNumber;
	int result;
	
    public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public void calculate ()
    {
		result= firstNumber+ secondNumber;
    	
    }
    public int display()
    {
    	return result;
    }
}
