package Collections;
import java.util.*;
public class ArrayListReverse
 {
   public static void main(String[]args)
    {
	   ArrayList<String> stationary=new ArrayList<String>();//creating new arraylist
	   Scanner S=new Scanner(System.in);
	   System.out.println("Enter the no of items");
	   int n=S.nextInt();
	   System.out.println("Enter the items");
	   for(int i=0;i<n;i++)
	    {
		   String item=S.next();
		   stationary.add(item);//adding items to arraylist
	    }
	   System.out.println(stationary);
	   for(int i=n-1;i>=0;i--)
	    {
		   System.out.println(stationary.get(i));//printing elements in reverse order
	    }	   
    }
 }
