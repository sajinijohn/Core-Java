import java.util.Scanner;
class innerclass
{
	private int a=10;
	class innerclass1
	{
		public void display()
		{
			System.out.println(a);
		}	
	}
	public static void main(String[]args)
	{
		innerclass outer=new innerclass();
		innerclass.innerclass1 ob=outer.new innerclass1();
		ob.display();
	}
}