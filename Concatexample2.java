package Stringmethods;
public class Concatexample2 
 {
	public static void main(String[]args)
    {
	   String str1="Hello";
	   String str2="Face@2.0";
	   String str3="Reader";
	   //concatenating space among strings
	   String str4=str1.concat(" ").concat(str2).concat(" ").concat(str3);
	   System.out.println(str4);
	   //concatenating special chars
	   String str5=str1.concat("!!!");
	   System.out.println(str5);
	   String str6=str1.concat("@").concat(str2);
	   System.out.println(str6);
    }
 }
