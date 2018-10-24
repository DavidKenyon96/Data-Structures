//Typical Fizzbuzz program 
public class Fizzbuzz {

	public void modCheck(int i)
	{	
		if (i%15==0)
			System.out.println("FizzBuzz");
		else if(i%3==0)
			System.out.println("Fizz");
		else if (i%5==0)
			System.out.println("Buzz");
		else
			System.out.println(i);
	}

	public void fizzbuzz()
	{
		for (int i=1; i<101; i++)
		{
			modCheck(i);		
		}
	}
	
	public static void main (String args[])
	{
		Fizzbuzz fb = new Fizzbuzz();
		fb.fizzbuzz();
	}
}
