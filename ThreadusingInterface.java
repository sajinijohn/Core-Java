package Multithreads;
public class ThreadusingInterface implements Runnable
 {
  public static void main(String[]args)
   {
	  ThreadusingInterface ts=new ThreadusingInterface();//creating thread for class
	  Thread t1=new Thread(ts);
	   t1.start();//Invokes the run method
   }
  public void run()
  {
	   System.out.println("Am in run method by Implementing Runnable");
  }
 }
