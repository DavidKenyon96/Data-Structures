//Simple recursion example
public class Recursion 
{
	public static void main(String[] args)
	{
		System.out.println("f(0) = " + f(0));
		System.out.println("f(1) = " + f(1));
		System.out.println("f(2) = " + f(2));
		System.out.println("f(3) = " + f(3));
		System.out.println("f(4) = " + f(4));

	}
	public static int f(int x)
	{
		System.out.println("Start f("+x+")");
		//f(x) = 2 * f(x-1) + x^2
		if(x == 0)
			return 0;
		else
		{
			System.out.println("Call again with f(x-1) or f("+(x-1)+")");
			return 2 * f(x-1) + (x*x);//equivalent = Math.pow(x,2)
		}
	}
}
