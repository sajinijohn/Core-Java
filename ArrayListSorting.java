package Collections;
import java.util.*;
public class ArrayListSorting 
 {
   public static void main(String[]args)
    {
	   Scanner S=new Scanner(System.in);
	   System.out.println("Enter the no.of subjects");
	   int n=S.nextInt();
	   ArrayList<Integer> marks=new ArrayList<Integer>();//creating arraylist
	   System.out.println("Enter the marks");
	   for(int i=1;i<=n;i++)
	   {
		   int submark=S.nextInt();
		   marks.add(submark);//adding marks to list
	   }
	   System.out.println(marks);
	   Collections.sort(marks);//arraylist sorting
	   System.out.println("Sorted list is:");
	   System.out.println(marks);
    }
 }
