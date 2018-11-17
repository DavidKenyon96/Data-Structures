//Resource: https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
//"Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm"
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {

    static void countSwaps(int[] a) 
    {
        boolean isSorted = false;
        int numSwaps = 0;
        int n = a.length - 1;
        
        while(!isSorted)
        {
            isSorted=true;
            for (int j = 0; j < n; j++) 
            {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) 
                {
                	//If we get to this point, array is still not sorted
                	isSorted = false;
                	//Thus, we swap adjacent elements
                    swap(a, j, j + 1);
                    //If we make it inside this loop, increment `numSwaps`
                    numSwaps++;               
                }
            }
            //Decrement `n` to keep track of unsorted portion of the array. The last n-1 and n-2 elements will be sorted on each pass
            n--;
        }
        //A rough approximation of the middle element to get an idea of the sort 
        double mid = a[a.length/2];
     
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("~Middle Element: " + mid);
        System.out.println("Last Element: " + a[a.length-1]);
    }

    static void swap (int [] a, int i, int j)
    {
        int temp = 0;
        //Set `temp` to the lower index value
        temp = a[i];
        
        //Set the lower index value to the higher index value 
        a[i] = a[j];
        
        //Set the higher index value to `temp`, which is holding the lower index value
        a[j] = temp;
        
        //Index pairs are sorted in ascending order
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] a;
        a = new int[] {39, 281, 48, 1, 3, 5,59, 5492};
        //			   1, 3, 5, 39, 48, 59,  281, 5492
        countSwaps(a);
    }
}
