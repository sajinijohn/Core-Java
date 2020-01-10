package Collections;
import java.util.*;
public class LinkedHashMapExample 
 {
	public static void main(String[] args)
	 {
	   Scanner S=new Scanner(System.in);
	   LinkedHashMap<String,Integer> lmap=new LinkedHashMap<String,Integer>();//creating linked hash map
	   System.out.println("Enter the no of values");
	   int n=S.nextInt();
	   System.out.println("Enter the details");
	   for(int i=0;i<n;i++)
	    {
		   String number=S.next();
		   int no=S.nextInt();
		   lmap.put(number,no);//adding values
	    }
	   for(Map.Entry m:lmap.entrySet())
	    {    
       System.out.println(m.getKey()+" "+m.getValue());//printing values
     }  
  }
}
