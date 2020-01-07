package Javadateclassical;
import java.util.Calendar;
public class JavacalenderExample 
 {
  public static void main(String[]args)
   {
	  Calendar calendar=Calendar.getInstance();
	  System.out.println("The current date is:"+calendar.getTime());
	  calendar.add(calendar.DATE,-15);//date before 15 days
	  System.out.println("15 days ago:"+calendar.getTime());
	  calendar.add(calendar.MONTH,4);//date after 4 months
	  System.out.println("4 months later:"+calendar.getTime());
	  calendar.add(calendar.YEAR,2);//date after 2 years
	  System.out.println("2 year later:"+calendar.getTime());
	  System.out.println("At present Calendar's year:"+calendar.get(Calendar.YEAR));//present calendar year
	  System.out.println("At present Calendar's day:"+calendar.get(Calendar.DATE));//present calendar day
	  System.out.println("At present date and time is:"+calendar.getTime());//present date and time
	  int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);//maximum days in week
	  System.out.println("Maximum number of days in week:"+maximum);
	  maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);//maximum weeks in year
	  System.out.println("Maximum number of weeks in year:"+maximum);
	  int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);//minimum days in week
	  System.out.println("Minimum number of days in week:"+minimum);
	  minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);//minimum weeks in year
	  System.out.println("Minimum number of weeks in year:"+minimum);
   }
 }
