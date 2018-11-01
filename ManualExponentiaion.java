//Program that finds the result of a base number set to a power without using Math.pow
public class ManualExponentiaion {

	
	public int exponentiation(int number, int exponent)
	{
		
		int temp = 1;
		
		for (int i=0; i<exponent; i++)
		{
			temp*=number;
		}
		
		return temp;
	}
	
	public static void main (String [] args)
	{
		int number = 5;
		int exponent = 4;
		ManualExponentiaion exp = new ManualExponentiaion();
		System.out.println(exp.exponentiation(number, exponent));
	}

}
