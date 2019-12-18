package Stringmethods;
public class Concatexample 
 {
   public static void main(String[]args)
    {
	   String s1="java string";
	   s1.concat("is imutable");
	   System.out.println(s1);//string is imutable so conact() doesn't work
	   s1=s1.concat("is mutable so assign it explicitly");
	   System.out.println(s1);//string is mutable by assign it explicitly
    }
 }
