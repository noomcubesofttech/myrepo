package com.cubesofttech.bdd.cucumber.calculator;

public class ScienceCalculator {

	private int presult;
	
	public int power(int a, int b)
	{
		int x = 1;
		for (int i=1 ; i <= b ; i++)
		{
			x = x * a;  
		}
		
		presult = x;
		
        return x; 		
	}
	
	public int getResult()
	{
		return presult;  
	}
}
