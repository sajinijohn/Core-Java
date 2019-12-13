package Strings;
public class Myclass 
 {
   public static void main(String args[])
    { 
	   String a="Well";
	   String ab="All is "+a;
	   String abc="All is Well";
	   String abcd="All is Well";
	   System.out.println(abc.hashCode());
	   System.out.println(ab.hashCode());
	   System.out.println(abc==ab.intern());//intern() provides same memory location for strings
	   System.out.println(abcd.hashCode());
    }
 }
