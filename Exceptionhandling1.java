package Exceptionhnadling;
class Test extends Exception{}
public class Exceptionhandling1 
 {
   public static void main(String[]args)
    {
	   try
	    {
		   throw new Test();//throw exception
	    }
	   catch(Test t)
	    {
		   System.out.println("Go to Test Exception");//catch block handles exception
	    }
	   finally
	    {
		   System.out.println("Inside finally block");//finally block always excecute
	    }
    }
 }
