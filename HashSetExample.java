package Collections;
import java.util.*;
public class HashSetExample 
 {
   public static void main(String[]args)
    {
	   Scanner S=new Scanner(System.in);
	   ArrayList<Integer> list=new ArrayList<Integer>();//creating array list
	   System.out.println("Enter the no of elements");
	   int n=S.nextInt();
	   System.out.println("Enter the elements");
	   for(int i=0;i<n;i++)
	    {
		   int e=S.nextInt();
		   list.add(e);
	    }
	   Set<Integer>set=new HashSet<Integer>();//creating hash set
	   set.addAll(list);//adding array list values to hash set
	   System.out.println(set);
    }
 }
