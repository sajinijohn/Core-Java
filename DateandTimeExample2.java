package Javadateandtime;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
public class DateandTimeExample2
 {
   public static void main(String args[])
   {
    //ISO Date
    LocalDate localdate1=LocalDate.now();
    DateTimeFormatter dateFormatter=DateTimeFormatter.ISO_LOCAL_DATE;
    System.out.println(localdate1.format(dateFormatter));
   
    // yyyy/MM/dd pattern
    DateTimeFormatter dateFormatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
    System.out.println(localdate1.format(dateFormatter1));
   
    // MM dd, yyyy pattern
    DateTimeFormatter dateFormatter2=DateTimeFormatter.ofPattern("MM dd, yyyy");
    System.out.println(localdate1.format(dateFormatter2));

    // dd-MMM-yyyy pattern
    DateTimeFormatter dateFormatter3=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    System.out.println(localdate1.format(dateFormatter3));
   
    // dd-LL-yyyy pattern
    DateTimeFormatter dateFormatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
    System.out.println(localdate1.format(dateFormatter4));   
    }
} 
