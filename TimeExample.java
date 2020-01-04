package Javadateandtime;
import java.time.LocalTime;
public class TimeExample 
 {
   public static void main(String[]args)
    {
	   //current Time
	   LocalTime localtime=LocalTime.now();
	   System.out.println(localtime);
	   //specific time
	   LocalTime localtime2=LocalTime.of(4,30,45);
	   System.out.println(localtime2);
	   System.out.println("Hour:"+localtime.getHour());
	   System.out.println("Minute:"+localtime.getMinute());
	   System.out.println("Second:"+localtime.getSecond());
	   //LocalTime's plus methods
	   System.out.println("Addintion of Hours:"+localtime.plusHours(2));
	   System.out.println("Addintion of Minutes:"+localtime.plusMinutes(30));
	   System.out.println("Addintion of Seconds:"+localtime.plusSeconds(20));
	   System.out.println("Addintion of Nanos:"+localtime.plusNanos(60000));
	    //LocalTime's minus methods
	   System.out.println("Substraction of Hours:"+localtime.minusHours(2));
	   System.out.println("Substraction of Minutes:"+localtime.minusMinutes(30));
	   System.out.println("Substraction of Seconds:"+localtime.minusSeconds(20));
	   System.out.println("Substraction of Nanos:"+localtime.minusNanos(60000));
	   LocalTime localtime3=LocalTime.of(11,45,20);
	   //compareTo() example
	   if(localtime.compareTo(localtime2)==0)
        {
	      System.out.println("localDate1 and localDate2 are equal");
        }
        else
         {
        	System.out.println("localDate1 and localDate2 are not equal");
         }	
	   //isBefore() example
	   if(localtime2.isBefore(localtime3))
	    {
		   System.out.println("localtime2 comes before localtime3");
	    }
	   //isAfter() example
	   if(localtime3.isAfter(localtime))
	    {
		   System.out.println("localtime3 comes after localtime1");
	    }
    }
 }
