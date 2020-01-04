package Javadateandtime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class JavaoffsetExample 
 {
   public static void main(String[]args)
    {
	   OffsetTime offset=OffsetTime.now();
	   int h=offset.get(ChronoField.HOUR_OF_DAY);//total hours of the day
	   System.out.println(h);
	   int m=offset.get(ChronoField.MINUTE_OF_DAY);//total minutes of the day
	   System.out.println(m);
	   int s=offset.get(ChronoField.SECOND_OF_DAY);//total seconds of the day
	   System.out.println(s);
	   int h1=offset.getHour();//current hour in system
	   System.out.println(h1+" hour");
	   int m1=offset.getMinute();//current minute in system
	   System.out.println(m1+" minute");
	   int s1=offset.getSecond();//current second in system
	   System.out.println(s1+" second");
    }
 } 
