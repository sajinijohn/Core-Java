package corejava;
import java.util.Scanner;
public class class2 {
	 String name;
	 String address;
	String ph;
	String email;
	String ptype;
	String pid;
	public class2(String name,String address,String ph,String email,String ptype,String pid)
	{
		this.name=name;
		this.address=address;
		this.ph=ph;
		this.email=email;
		this.ptype=ptype;
		this.pid=pid;
	}
	public void register()
	{
		System.out.println("Thank you for registering.");
		System.out.println("Name "+name);
		System.out.println("address "+address);
		System.out.println("phone number "+ph);
		System.out.println("email "+email);
		System.out.println("proof type "+ptype);
		System.out.println("proof id "+pid);
	}
     public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=ob.next();
		System.out.println("Enter your address:");
		String address=ob.next();
		System.out.println("Contact Number:");
	    String ph=ob.next();
		System.out.println("Email ID:");
		String email=ob.next();
		System.out.println("Enter proof type:");
	   String ptype=ob.next();
		System.out.println("Enter proof id:");
		String pid=ob.next();
		class2 a=new class2(name,address,ph,email,ptype,pid);
		a.register();
		

		}
	}

