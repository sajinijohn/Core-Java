package Collections;
import java.util.*;
public class HashMapContainsExample 
 {
   public static void main(String[]args)
    {
	   Scanner S=new Scanner(System.in);
	   HashMap<Integer,String> map=new HashMap<Integer,String>();//creating hash map
	   System.out.println("Enter the no of values");
	   int n=S.nextInt();
	   System.out.println("Enter the values");
	   for(int i=0;i<n;i++)
	    {
		   int no=S.nextInt();
		   String number=S.next();
		   map.put(no,number);//adding values to hash map
	    }
	   System.out.println("Enter the key to be search");
	   int n1=S.nextInt();
	   System.out.println(map.containsKey(n1));//search for the key
	   System.out.println("Enter the value to be search");
	   String n2=S.next();
	   System.out.println(map.containsValue(n2));//search for the value
    }
 }
