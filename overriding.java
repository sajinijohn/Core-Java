package corejava;
import java.util.Scanner;
class animal{
	public void animalsound()
	{
		System.out.println("Different animal sound");
	}
}
class Lion extends animal
{
	public void animalsound()
	{
		System.out.println("Lion rors");
	}
	}
class cat extends animal
{
	public void animalsound()
	{
		System.out.println("cat mewos");
	}
}
public class overriding {
	public static void main(String[]args)
	{
		animal myanimal=new animal();
		animal mylion=new Lion();
		animal mycat=new cat();
		myanimal.animalsound();
		mylion.animalsound();
		mycat.animalsound();
	}

}
