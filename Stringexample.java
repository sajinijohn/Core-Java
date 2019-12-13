package Strings;
public class Stringexample 
 {
   public static void main(String[]args)
   {
	   String str="I, am, going, to, split, this, string by, space";
	   String[] str1=str.split(",");//split() method removes commas
	   for(String a:str1)// for each loop to traverse the array
		   System.out.print(a);
   }
 }
