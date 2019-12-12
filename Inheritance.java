package corejava;
import java.util.Scanner;
class A
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is"+c);
	}
}
public class Inheritance extends A 
{
	public void add(int a,int b)
	{
		int c=a+b+10;
		System.out.println("Sum is "+c);
	}
public static void main(String[]args)
{
	Scanner S=new Scanner(System.in);
	A s=new Inheritance();
	System.out.println("enter the number");
	int a=S.nextInt();
	System.out.println("enter the number");
	int b=S.nextInt();
	s.add(a,b);
	}

}
