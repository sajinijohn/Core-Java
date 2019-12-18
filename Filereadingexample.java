package Stringtokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Filereadingexample 
 {
   public static void main(String[]args)
    {
	   BufferedReader br=null;
	   try
	   {
		   String line;
		   br=new BufferedReader(new FileReader("C:\\Users\\user_2\\eclipse-workspace\\corejava\\src\\Stringtokenizer\\stokenfile.txt"));
		   while((line=br.readLine())!=null)
			{ 
			   System.out.println(line);
			   StringTokenizer stokenizer=new StringTokenizer(line,"|");
			
		       while(stokenizer.hasMoreElements())
		       {
			      Integer id=Integer.parseInt(stokenizer.nextElement().toString());
			      Double price=Double.parseDouble(stokenizer.nextElement().toString());
			      String username=stokenizer.nextElement().toString();
			      StringBuilder sb=new StringBuilder();
			      sb.append("\nId :"+id);
			      sb.append("\nprice :"+price);
			      sb.append("\nUsername :"+username);
			      sb.append("\n**************************\n");
			      System.out.println(sb);
		      }
		   }
		   System.out.println("Done");
	   }
	   catch(IOException e)
	    {
		   e.printStackTrace();
	    }
	   finally
	    {
		  try
		   {
			 if(br!=null)
				   br.close();
		   } 
		  catch (IOException ex)
		   {
			   ex.printStackTrace();
		   } 
	    }
	  }
     }