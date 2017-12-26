//Selection problem program
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class SelectionProblem 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		//Time keeping started
		long startTime = System.nanoTime();
		//Open file with scanner utility
		Scanner s = new Scanner(new File("Numbers"));
		//Create ArrayList to be filled by the while loop below
		ArrayList<Integer> nums = new ArrayList<Integer>();
		//Read until end of file is reached
		while(s.hasNextInt())
		{
			//Add each value found to nums
			nums.add(s.nextInt());
		}
		
		long endReadFile = System.nanoTime();
		//Loop through each value in the ArrayList
		for(int n : nums)
		{
			System.out.println(n);
		}
		//Sort, reverse, and print numbers
		Collections.sort(nums);
		Collections.reverse(nums);
		System.out.println(nums);
		//Time keeping ended
		long endProgram = System.nanoTime();
		System.out.println("Runtime of reading file contents:" + 
				String.format( "%12.6f",((endReadFile-startTime)/Math.pow(10,9))));
		System.out.println("Runtime of entire program:" + 
				String.format( "%12.6f",((endProgram-startTime)/Math.pow(10,9)))); 	
		
		for(Integer n:nums) {
            System.out.println(n);
			}

	}
}