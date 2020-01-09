package Collections;
import java.util.*;
public class LinkedListExample
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
		List<String> li=new LinkedList<String>();//creating linked list
		int n1=S.nextInt();
		for(int i=0;i<n1;i++)
		{
		  String in=S.next();
		  li.add(in);//adding values to linked list
		}
		ArrayList<String> al=new ArrayList<String>();//creating array list
		int n2=S.nextInt();
		for(int i=0;i<n2;i++)
		{
		    String inp=S.next();
		    al.add(inp);//adding values to array list
		}
		System.out.println("Actual Linked List: "+li);
		li.addAll(al);//copying values from array list 
		System.out.println("After copy: "+li);
	}
}