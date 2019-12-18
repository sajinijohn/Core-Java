package Stringmethods;
public class CharAtexample3
 {
	public static void main(String[]args)
	   { 
		  String str="Welcome to Face portal";
		  int count=0;
		  for(int i=0;i<=str.length()-1;i++)//iterate till the length of the string
		   {
			  if(str.charAt(i)=='t')
			   {
				  count++;//count will increment based on number of t in the string
			   }
		   }
		   System.out.println("Frequency of t is: "+count);//printing the count value
	   }

 }
