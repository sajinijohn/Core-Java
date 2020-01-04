package Javadateandtime;
import java.time.OffsetDateTime;
public class JavaOffsetDateandTimeExample 
 {
   public static void main(String[]args)
    {
	   OffsetDateTime offsetDT=OffsetDateTime.now();
	   System.out.println(offsetDT.getDayOfMonth());//To get the day in this month
	   System.out.println(offsetDT.getDayOfYear());//To get the day in this year
	   System.out.println(offsetDT.getDayOfWeek());//To get the day in this Week
	   System.out.println(offsetDT.toLocalDate());//To get the current date
	   OffsetDateTime value1=offsetDT.minusDays(240);//used to return a copy of this OffsetDateTime with the specified number of days subtracted
	   System.out.println(value1);
	   OffsetDateTime value2=offsetDT.plusDays(240);//used to return a copy of this OffsetDateTime with the specified number of days added
	   System.out.println(value2);
    }
 }
