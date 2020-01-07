package Javadateclassical;
import java.util.*;
public class JavaTimeZoneExample 
 {
   public static void main(String[]args)
    {
	   String[] id=TimeZone.getAvailableIDs();
	   System.out.println("In TimeZone class available Ida are:");
	   for(int i=0;i<id.length;i++)
	    {
		   System.out.println(id[i]);
	    }
	   TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");
	   System.out.println("The offset value of TimeZone:"+zone.getOffset(Calendar.ZONE_OFFSET));
	   System.out.println("value of id is:"+zone.getID());
	   TimeZone zone1=TimeZone.getDefault();
	   String name=zone1.getDisplayName();
	   System.out.println("Display name for default time zone:"+name);
    }
 }
