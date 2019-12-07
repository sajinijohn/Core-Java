import java.util.Scanner;
abstract class Anonymous {
	public abstract void learn();

	public static void main(String[]args)
	{
		Anonymous ob=new Anonymous()
		{
		 public void learn()
		{
			System.out.println("welcome to ddu-gky");
		}
		};
		ob.learn();
	}
	}
