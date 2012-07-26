import java.util.*;

/* CalendarCalculator is an exercise from Teach Yourself Java which will take 
 * a day of the year and calculate the number of days remaining.
 * 
 * @author PhoenixElijah
 * @date 7/25/2012
 * 
 */
//------------------------------------------------------------------------------
class CalendarCalculator{
    static int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//------------------------------------------------------------------------------
    public static void main(String args[]){
        //Declare variables.
        GregorianCalendar calendar;
        int year;
        int month;
        int date;
        int daysLeft = 0;
        
        //Build calendar with args if they are provided.
        if (args.length > 0) {
            year = Integer.parseInt(args[0]);
            month = Integer.parseInt(args[1]);
            date = Integer.parseInt(args[2]);
            calendar = new GregorianCalendar(year, month, date);
        //otherwise, build calendar with current date.
        } else {
            calendar = new GregorianCalendar();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            date = calendar.get(Calendar.DATE);
        }
        
        //Display current values.
        System.out.println(month);
        System.out.println(date);
        System.out.println(year);
        Boolean ly = calendar.isLeapYear(year);
        System.out.println(ly);

        //Set daysLeft to 1 if it is a leap year and also January or February.
        if (ly = true){
            if (month <=2){
                daysLeft += 1;
            }
        }
        
        //Increment daysLeft by the number of days left in particular month.
        daysLeft += daysInMonth[month-1] - date;
        
        //Print out results thus far.
        System.out.println("Days left in month: " + daysLeft);
        
        //Calculate the rest of the days in the year.
        for (int i = month; i < daysInMonth.length; i++){
            daysLeft += daysInMonth[i];
        }
        
        //Display results!
        System.out.println("Days left in year: " + daysLeft);
    }
//------------------------------------------------------------------------------    
}