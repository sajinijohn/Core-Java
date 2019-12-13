package Strings;
public class Stringclass 
 {
   public static void main(String args[])
    {
	   String s1,s2;
	   s1=new String("Sajini");
	   s2=new String("Sajini");
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s1==s2);//false (because both refer to different instance)
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   s2=s1+s2;//concatenation operation
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
    }
 }
