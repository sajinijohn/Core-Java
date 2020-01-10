package Collections;
import java.util.*;
public class HashSetExample1 
 {
   public static void main(String[]args)
    {
	   Scanner S=new Scanner(System.in);
	   Set<String> popularCities=new HashSet<String>();
	   System.out.println("Is popularCities set empty?: "+popularCities.isEmpty());//check whether hash list is empty or not
	   System.out.println("enter no of cities");
	   int n=S.nextInt();
	   System.out.println("enter cities");
	   S.next();
	   for(int i=1;i<=n;i++)
	    {
		   String city=S.nextLine();
		   popularCities.add(city);//adding cities to the list
	    }
	   System.out.println("Number of cities in the HashSet "+popularCities.size());
	   System.out.println("enter the city to search");
	   String city1=S.nextLine();
	   if(popularCities.contains(city1))//check whether given city is present in the list
	   {
	     System.out.println(city1+"is in the popularcities set");
	   }
	   else
	   {
		 System.out.println(city1+"is not in the popularcities set");
	   }
    }
 }
