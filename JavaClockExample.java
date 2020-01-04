package Javadateandtime;
import java.time.Clock;
import java.time.Duration;
public class JavaClockExample 
 {
   public static void main(String[]args)
   {
	 Clock c1=Clock.systemDefaultZone();//converting to date and time using the default time-zone.
	 System.out.println(c1.getZone());//to get the time-zone 
	 Clock c2=Clock.systemUTC();//converting to date and time using the UTC time zone.
	 System.out.println(c2.instant());
	 Duration d=Duration.ofMinutes(330);
	 Clock clock=Clock.offset(c2,d);//to obtain a clock that returns instants from the specified clock with the specified duration added
	 System.out.println(clock.instant());
   }
 }
