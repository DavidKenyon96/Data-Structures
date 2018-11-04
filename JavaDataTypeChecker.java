import java.util.*;
import java.io.*;

public class JavaDataTypeChecker{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers you would like to check: ");
        int t=sc.nextInt();
        int counter=1; 
        for(int i=0;i<t;i++)
        {
            try
            {
            	System.out.println("Enter number " + counter);
                long x=sc.nextLong();
                System.out.println(x+" can be fit in:");

                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                    System.out.println("* byte\n* short\n* int\n* long");
                else if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                    System.out.println("* short\n* int\n* long");
                else if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                    System.out.println("* int\n* long");   
                else
                    System.out.println("* long");
                counter++;
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fit anywhere.");
            } 
        }
    }
}

