package Consoleclass;
import java.io.Console;
public class Consoleclassexample 
 {
   public static void main(String[]args)
   {
	   String str;
	   Console con=System.console();//creating object for console 
	   if(con==null)
	   {
		   System.out.print("No console available");
		   return;
	   }
	   str=con.readLine("Enter your name: ");//reading a string
	   System.out.print(str);
	   System.out.println("Enter your password: ");
	   char[] ch=con.readPassword();//reading password
	   String pass=String.valueOf(ch);
	   System.out.println("password is: "+pass);
   }
 }
