import java.util.Scanner;
class innerclass
{
	private int a=10;
	class innerclass1//inner class
	 {
		public void display()
		 {
			System.out.println(a);
		 }	
	 }
	public static void main(String[]args)
	{
		innerclass outer=new innerclass();//creating object for outer class
		innerclass.innerclass1 ob=outer.new innerclass1();//creating object for inner class
		ob.display();
	}
}
