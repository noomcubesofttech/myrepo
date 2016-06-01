package math;

public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public double plus(double a , double b)
	{
		return a+b;
	}

	public  double minus(double a , double b)
	{
		return a-b;
	}
	
	public  double multiply(double a , double b)
	{
		return a*b;
	}
	
	public  double division(double a , double b)
	{
		return a/b;
	}
	
	public  double power(double a , double b)
	{
		double temp = 1;
		for (int i=1; i<=b ; i++)
		{
			temp = temp *a; 
		}
		return temp;
	}
}
