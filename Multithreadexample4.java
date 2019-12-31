package Multithreads;
public class Multithreadexample4 extends Thread 
 {
   public void run()
    {
	   try
	    {
		   System.out.println("Music player is running ");
		   Thread.sleep(1000);
	    }
	   catch(InterruptedException e)
	    {
		   System.out.println("Received a watsapp notification");
	    }
    }
   public static void main(String[]args)
    {
	   Multithreadexample4 t=new Multithreadexample4();
	   t.start();
	   t.interrupt();
    }
 }
	
