//Reference: https://www.hackerrank.com/challenges/time-conversion/problem
//Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

	static String timeConversion(String s) {
		
        //Get index of AM/PM
        char AMPMIndex= s.charAt(8);
        
        //Preserve part of time that remains unchanged (minutes,seconds are not changed at all)
        String unchanged = s.substring(2,8);
        String unchangedNoAMPM= s.substring(0,8);
        
        //Get first two numbers of String s (ie. the current hour)
        String hourIndex1 = String.valueOf(s.charAt(0));
        String hourIndex2 = String.valueOf(s.charAt(1));
        
        //Parse String to an int for mathematical operations
        int timeIndex1Int = Integer.parseInt(hourIndex1);
        int timeIndex2Int = Integer.parseInt(hourIndex2);
        
        //Concatenate the two numbers together 
        int hours = Integer.parseInt(Integer.toString(timeIndex1Int) +                                         Integer.toString(timeIndex2Int));
        int militaryTime=0;
        
        /*****NOTE: I did not use a switch case for this because there are some scenarios that 
        have multiple conditions that need to be met to proceed*****/
        
        //If its 12PM, the only change that is needed is to remove the PM from the end
        if(AMPMIndex=='P' && hours==12)
        {
            return unchangedNoAMPM;
        } 
        //Similar to above, if its AM with a first digit value of 0, then remove AM from the end
        else if (AMPMIndex=='A' && timeIndex1Int==0)
            return unchangedNoAMPM;
        
        //If AMPIndex=='P', meaning the time is PM, begin conversion
        else if(AMPMIndex=='P')
        {
            militaryTime = hours+12;
            String adjustedTime = Integer.toString(militaryTime);     
            return adjustedTime+unchanged;
        }
        
        //If its 12AM, the only change that is needed is for the hours to be changed to 0
        else if(AMPMIndex=='A' && hours==12)
        {
            String adjustedTime = "00";    
            return adjustedTime+unchanged;
        }

        else
            return "Improper time format. Try again";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s="12:45:54PM";
        String result = timeConversion(s);

        System.out.println(result);
    }
}
