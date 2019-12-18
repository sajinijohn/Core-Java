package Stringmethods;
public class CharAtexample2 
 {
	 public static void main(String[]args)
	   { 
		  String str="Welcome to Face portal";
		  int strlength=str.length();
		  //fetching first character
		  System.out.println("character at 1st index is: "+str.charAt(1));
		  //The last character is present at the string length-1 index
		  System.out.println("character at last index is: "+str.charAt(strlength-1));	  
	   }
 }
