import java.io.*;
import java.util.*;

class Result 
{
    static String dayValue;

    public static String findDay(int month, int day, int year) 
    {
        GregorianCalendar  cal = new GregorianCalendar();
        cal.set(year, month-1,day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        
        switch(dayNumber)
        {
            case 1:
                dayValue = "SUNDAY";
                break;
            case 2:
                dayValue = "MONDAY";
                break;
            case 3:
                dayValue = "TUESDAY";
                break;
            case 4:
                dayValue = "WEDNESDAY";
                break;
            case 5:
                 dayValue = "THURSDAY";
                 break;
            case 6:
                dayValue = "FRIDAY";
                break;
            case 7:
                dayValue = "SATURDAY";
                break;      
            default: 
                break;     
        }
        return dayValue;
    }
}
public class JavaDateAndTime
{
    public static void main(String[] args) throws IOException 
    {
        int month = 05;

        int day = 23;

        int year = 2018;

        String res = Result.findDay(month, day, year);

        System.out.println(res);
    }
}