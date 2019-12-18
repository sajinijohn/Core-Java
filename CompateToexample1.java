package Stringmethods;
public class CompateToexample1 
 { 
	public static void main(String[]args)
	 {
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//5 comparing with empty string gives the length of the string
		System.out.println(s2.compareTo(s3));//-2 s3 is lower than s2
	 }
 }
