package Exceptionhnadling;
public class Exceptionhandlingexample 
 {
   static void check() throws ArithmeticException//exception declaration
    {
	   System.out.println("Inside check function");
	   throw new ArithmeticException("FACE Kollam");//exception throw to catch block
    }
   public static void main(String[]args)
    {
	  try
	   {
		 check(); 
	   }
	  catch(ArithmeticException e)
	   {
		  System.out.println("caught"+e);//catch block handles exception
	   }
    } 
 }
