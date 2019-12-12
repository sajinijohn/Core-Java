package corejava;
import java.util.Scanner;
public class class1
 {                       // data members
	String name;
	String address;
	String ph;
	String email;
	String ptype;
	String pid;
 public static void main(String[]args)
  {
	Scanner ob=new Scanner(System.in);
	class1 a=new class1();//creating object
	System.out.println("Enter your name:");
	a.name=ob.next();
	System.out.println("Enter your address:");
	a.address=ob.next();
	System.out.println("Contact Number:");
	a.ph=ob.next();
	System.out.println("Email ID:");
	a.email=ob.next();
	System.out.println("Enter proof type:");
	a.ptype=ob.next();
	System.out.println("Enter proof id:");
	a.pid=ob.next();
	System.out.println("Thank you for registering.");
	System.out.println("Name "+a.name);
	System.out.println("address "+a.address);
	System.out.println("phone number "+a.ph);
	System.out.println("email "+a.email);
	System.out.println("proof type "+a.ptype);
	System.out.println("proof id "+a.pid);
   }
}
