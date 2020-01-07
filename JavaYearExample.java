package Javadateandtime;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaYearExample
 {
   public static void main(String args[])
    {
	   Year y1=Year.now();
	   System.out.println(y1);//To get current year
	   Year y2=Year.of(2020);
	   LocalDate l=y2.atDay(100);//To get the date of specified number
	   System.out.println(l);
	   System.out.println(y2.length());//To know total number of days
	   System.out.println(y2.isLeap());//To check is a leap year
	   YearMonth ym=YearMonth.now();
	   System.out.println(ym);//To print year-month
	   String s=ym.format(DateTimeFormatter.ofPattern("MM yyyy"));//Specify date in formatt of "MM yyyy"
	   System.out.println(s);
	   long l1=ym.getLong(ChronoField.YEAR);//To get year
	   System.out.println(l1);
	   long l2=ym.getLong(ChronoField.MONTH_OF_YEAR);//To get month of year
	   System.out.println(l2);
	   YearMonth ym2=ym.plus(Period.ofYears(2));//To add specified number of years
	   System.out.println(ym2);
	   YearMonth ym3=ym.minus(Period.ofYears(2));//To substract specified number of years
	   System.out.println(ym3);
    }
 }