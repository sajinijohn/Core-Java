package Stringmethods;
public class Containsexample1 
 {
   public static void main(String[]args)
    {
	   String str="Hello F#A#C#E@2.0 readers";
	   boolean isContains=str.contains("F#A#C#E");
	   System.out.println(isContains);
	   //case sensitive
	   System.out.println(str.contains("FACe"));
    }
 }
