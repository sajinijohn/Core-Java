package Stringmethods;
public class EndsWithexample1 
 {
  public static void main(String[]args)
   {
	  String str="Welcome to FACE.in";
	  System.out.println(str.endsWith("in"));
	  //searching the last characters
	  if(str.endsWith(".com"))
	   {
		 System.out.println("string ends with .com"); 
	   }
	  else
		  System.out.println("It does not ends with .com");
   }
 }
