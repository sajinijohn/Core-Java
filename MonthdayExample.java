package Javadateandtime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthdayExample
 {
   public static void main(String[]args)
    {
	   MonthDay month=MonthDay.now();
	   LocalDate date=month.atYear(2019);
	   System.out.println(date);//print the date at the year 2019
	   boolean a=month.isValidYear(2018);//check the year valid for this month and day
	   System.out.println(a);
	   long b=month.get(ChronoField.MONTH_OF_YEAR);//current month in the year
	   System.out.println(b);
	   ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);//range of months in that year
	   System.out.println(r1);
	   ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);//range of days in the month
	   System.out.println(r2);
    }
 }
