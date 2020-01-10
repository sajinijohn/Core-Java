package Collections;
import java.util.*;
import java.lang.Math;
public class HashSetExample2 
 {
   public static void main(String[]args)
    {
	   Scanner S=new Scanner(System.in);
	   Set<Integer> set=new HashSet<Integer>();
	   ArrayList<Integer>set1=new ArrayList<Integer>();
	   System.out.println("Enter the no of elements");
	   int n=S.nextInt();
	   System.out.println("Enter elements");
	   for(int i=0;i<n;i++)
	    {
		   int e1=S.nextInt();
		   set1.add(e1);
	    }
	   set.addAll(set1);
	   System.out.println("numbers: "+set);
	   System.out.println("Enter the element to be removed");
	   int e2=S.nextInt();
	   set.remove(e2);
	   System.out.println("after remove("+e2+"): "+set);
	   for(int i=0;i<set1.size();i++)
       {
		   int num=set1.get(i);
		   int sqrt=(int)Math.sqrt(num);
		   if((sqrt*sqrt)==num)
		   {
			   set.remove(num);
		   }
	    }
	  
	   System.out.println("After removeAll(perfectSquares): "+set);
	   set.clear();
	   System.out.println("After clear(): "+set);
    }
 }
