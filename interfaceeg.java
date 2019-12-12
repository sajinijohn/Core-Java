package corejava;
interface IT1//interface
 {
	void method1();//abstract method
	void method2();
	void method3();
 }

public class interfaceeg implements IT1 
 {
	public void method1()
	 {
	   System.out.println("Method 1");
	 }
	public void method2()
	 {
	   System.out.println("Method 2");
	 }
	public void method3()
	 {
	   System.out.println("Method 3");
	 }
public static void main(String[]args)
 {
	IT1 T=new interfaceeg();
	T.method1();
	T.method2();
	T.method3();
 }
}
