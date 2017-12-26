//simple program to test evaluating the runtime of a nested for loop
public class ForLoopRuntime 
{
	public static void main(String[] args) 
	{
		long startTime = System.nanoTime();
		int sum = 0;
		int n=1000;
		for( int i = 0; i < n; i++ )
			for( int j = 0;j<n * n; j++ )
			sum++;
		long endTime = System.nanoTime();
		System.out.println("Runtime:" + 
				String.format( "%12.6f",((endTime-startTime)/Math.pow(10,9))));
	}
}
