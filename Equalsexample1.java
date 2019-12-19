package Stringmethods;
import java.util.ArrayList;
public class Equalsexample1 
 {
  public static void main(String[]args)
   {
	  String str1="FACENXT";
	  ArrayList<String> list=new ArrayList<>();//declaring ArrayList
	  list.add("FACE");
	  list.add("FACEPREP");
	  list.add("FACENXT");
	  list.add("FACENOW");
	  //searching the string
	  for(String str:list)
	   {
		  if(str.equals(str1))
		   { 
			 System.out.println("FACENXT is present");  
		   }
	   }
   }
 }
