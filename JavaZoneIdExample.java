package Javadateandtime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
public class JavaZoneIdExample
 {
   public static void main(String args[])
    {
    ZoneId zoneid1=ZoneId.of("Asia/Kolkata");
    ZoneId zoneid2=ZoneId.of("Asia/Tokyo");
    LocalTime id1=LocalTime.now(zoneid1);//To get local time of zone id "Asia/Kolkata"
    LocalTime id2=LocalTime.now(zoneid2);//To get local time of zone id "Asia/Tokyo"
    System.out.println(id1);
    System.out.println(id2);
    System.out.println(id1.isBefore(id2));//To check id1 is before id2
    ZoneId zone=ZoneId.systemDefault();
    System.out.println(zone);
    String s=zone.getId();
    System.out.println(s);
    System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));
    }
}