package Stringmethods;
public class Containsexample 
 {
   public static void main(String[]args)
    {
	   String name="What do you know about me"; 
	   //searching of a word
	   System.out.println(name.contains("do you know"));//check whether the substring is present in given string
	   System.out.println(name.contains("about"));
	   System.out.println(name.contains("hello"));
    }
 }
