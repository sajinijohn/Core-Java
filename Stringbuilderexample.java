package Stringbuilder;
public class Stringbuilderexample 
 {
   public static void main(String[]args)
    { 
	   StringBuilder s1=new StringBuilder("Hello");//string1 is declared
	   StringBuilder s2=new StringBuilder("World");//string2 is declared
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s1.hashCode());//printing hash code of string1
	   System.out.println(s2.hashCode());//printing hash code of string2
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s1.append(s2));//appending string2 to string1
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s1.hashCode());//new hash code will be same as old using builder function
	   System.out.println(s2.hashCode());
    }
 }
