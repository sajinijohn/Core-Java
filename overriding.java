package corejava;
import java.util.Scanner;
class animal//parent class
 {
	public void animalsound()
	 {
	   System.out.println("Different animal sound");
	 }
 }
//overriding
class Lion extends animal//inherited class
 {
   public void animalsound()
    {
	System.out.println("Lion rors");
     }
 }
//overriding
class cat extends animal//inherited class
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
