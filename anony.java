import java.util.Scanner;
abstract class anonym
{
	public abstract void learn();
	}
public class anony {
	public static void main(String[]args)
	{
		anonym ob=new anonym()
		{
		 public void learn()
		{
			System.out.println("welcome to ddu-gky");
		}
		};
		ob.learn();
	}
}
