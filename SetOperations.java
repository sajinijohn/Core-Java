package Collections;
import java.util.*;
public class SetOperations 
 {
   public static void main(String[]args)
    {
	   Scanner S=new Scanner(System.in);
	   Set<Integer>set1=new HashSet<Integer>();//creating set
	   System.out.println("Enter the no of elements");
	   int n1=S.nextInt();
	   System.out.println("Enter the elements in set1");
	   for(int i=0;i<n1;i++)
	    {
		   int c1=S.nextInt();
		   set1.add(c1);//adding elements to set1
	    }
	   Set<Integer>set2=new HashSet<Integer>();
	   System.out.println("Enter the no of elements");
	   int n2=S.nextInt();
	   System.out.println("Enter the elements in set2");
	   for(int i=0;i<n2;i++)
	    {
		   int c2=S.nextInt();
		   set2.add(c2);//adding elements to set2
	    }
	   //union operation
	   Set<Integer>union=new HashSet<Integer>(set1);
	   union.addAll(set2);
	   System.out.println("After union operation:");
	   System.out.println(union);
	   //intersection operation
	   Set<Integer>intersection=new HashSet<Integer>(set1);
	   intersection.retainAll(set2);
	   System.out.println("After Intersection operation:");
	   System.out.println(intersection);
	   //symmetric difference
	   Set<Integer>symdiff=new HashSet<Integer>(set1);
	   symdiff.removeAll(set2);
	   System.out.println("After symmetric difference operation:");
	   System.out.println(symdiff);

    }
 }
