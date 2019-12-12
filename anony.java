import java.util.Scanner;
abstract class anonym//abstract class
 {
  public abstract void learn();//abstract method
 }
 public class anony
  {
public static void main(String[]args)
 {
   anonym ob=new anonym()//anonymous class
     {
	 public void learn()
	  {
	    System.out.println("welcome to ddu-gky");
	   }
     };//anonymous class ends
 ob.learn();
  }
}
