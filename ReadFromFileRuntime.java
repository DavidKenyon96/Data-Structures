//Program that reads from a file and adds the 100 random numbers in the file. The program then evaluates the runtime of reading said file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFileRuntime 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		long startTime = System.nanoTime();
		//Open file with scanner utility
		Scanner s = new Scanner(new File("random100.txt"));
		//Create ArrayList to be filled by the while loop below
		ArrayList<Integer> nums = new ArrayList<Integer>();
		//Read until end of file is reached
		while(s.hasNextInt())
		{
			//Add each value found to nums
			nums.add(s.nextInt());
		}
		long endReadFile = System.nanoTime();
		//Loop through and print every value in the nums
		for(int n : nums)
		{
			System.out.println(n);
		}
		//Time is captured here
		long endProgram = System.nanoTime();
		System.out.println("Runtime of reading file contents:" + 
				String.format( "%12.6f",((endReadFile-startTime)/Math.pow(10,9))));
		System.out.println("Runtime of entire program:" + 
				String.format( "%12.6f",((endProgram-startTime)/Math.pow(10,9))));
		
	}
}
