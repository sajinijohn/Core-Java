package Collections;
import java.util.*;
public class HashMapExample 
 {
   public static void main(String[]args)
    {
	   Scanner S=new Scanner(System.in);
	   HashMap<Integer,String> map=new HashMap<Integer,String>();//creating hash map
	   System.out.println("Enter the no of students");
	   int n=S.nextInt();
	   System.out.println("Enter the details");
	   for(int i=0;i<n;i++)
	    {
		   int roll=S.nextInt();
		   String name=S.next();
		   map.put(roll,name);//adding values
	    }
	   for(Map.Entry m:map.entrySet())
	    {    
          System.out.println(m.getKey()+" "+m.getValue());    //printing values
        }  
    }
 }
