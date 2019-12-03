package corejava;

import java.util.Scanner;

public class class31 {
	String name;
	 String address;
	String ph;
	String email;
	String ptype;
	String pid;
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
		class32 a=new class32();
		a.setname(name);
		a.setadd(address);
		a.setphone(ph);
		a.setemail(email);
		a.setprooft(ptype);
		a.setproofid(pid);
		System.out.println("Name "+a.getname());
		System.out.println("address "+a.getadd());
		System.out.println("phone number "+a.getphone());
		System.out.println("email "+a.getemail());
		System.out.println("proof type "+a.getprooft());
		System.out.println("proof id "+a.getproofid());
		
		}
}
