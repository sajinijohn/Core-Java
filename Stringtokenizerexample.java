package Stringtokenizer;
import java.util.StringTokenizer;
public class Stringtokenizerexample 
 {
   public static void main(String[]args)
    {
	   String str="I , am , going , to , split , this , string by ,space";
	   StringTokenizer st= new StringTokenizer(str);// default function is split by space
	   System.out.println("split by space");
	   while(st.hasMoreElements())
	    {
		   System.out.print(st.nextElement());
	    }
	   System.out.println();
	   System.out.println("split by ,");
	   StringTokenizer st2=new StringTokenizer(str, ",");// default function is split by comma
	   while(st2.hasMoreElements())
	    {
		   System.out.print(st2.nextElement());
	    }
    } 
 }
