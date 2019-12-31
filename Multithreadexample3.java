package Multithreads;
public class Multithreadexample3 extends Thread 
 {
   public static void main(String[]args)
    {
	   Multithreadexample3 t1=new Multithreadexample3();//creating thread for class
	   t1.start();//Invokes the run method
    }
   public void run()
   {
	   System.out.println("Am in run method by extending thread");
   }
 }
