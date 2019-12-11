package Objectclass;

public class Objclass {
	static int last_roll;
	int roll_no;
	//constructor
Objclass()
{
	roll_no=last_roll;
	last_roll++;
	}
//overriding hashcode()
public int hashcode()
{
	return roll_no;
	}
//driver code
public static void main(String[]args)
{
	Objclass s=new Objclass();
	System.out.println(s);
	System.out.println(s.toString());
	Object obj=new String("Face");
	Class c=obj.getClass();
	System.out.println("class of object obj is: "+c.getName());
	s=null;
	System.gc();//garbage collection
	}
protected void finalize()//method only excutes after garbage collection done
{
	System.out.println("finalize method called");
	}
}
