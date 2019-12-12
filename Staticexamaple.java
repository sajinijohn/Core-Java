package staticexp;
public class Staticexamaple 
{
  static int count=0;//static variable
  Staticexamaple()
  {
     count++;
     System.out.println(count);
  }
 public static void main(String[]args)
  {
	Staticexamaple c1=new Staticexamaple();//first object created
	Staticexamaple c2=new Staticexamaple();//second object created
	Staticexamaple c3=new Staticexamaple();///third object created
	
  }
}
