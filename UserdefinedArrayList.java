package Collections;
import java.util.*;
class Contacts
 {
	private String name;
	private int phonenumber;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setphonenumber(int phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	public String getname()
	{
		return name;
	}
	public int getphonenumber()
	{
		return phonenumber;
	}
 }
public class UserdefinedArrayList 
 {
   public static void main(String[]args)
    {
	   Contacts ob=new Contacts();
	   ob.setname("tim");
	   ob.setphonenumber(181888424);
	   Contacts ob1=new Contacts();
	   ob1.setname("john");
	   ob1.setphonenumber(181888425);
	   ArrayList<Contacts>contact=new ArrayList<Contacts>();
	   contact.add(ob);
	   contact.add(ob1);
	   System.out.println(contact.get(0).getname()+" "+contact.get(0).getphonenumber());
	   System.out.println(contact.get(1).getname()+" "+contact.get(1).getphonenumber());
    }
 }
