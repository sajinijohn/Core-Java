package Multithreads;
public class DaemonThreadexample extends Thread
 {
   public void run()
    {
	   if(Thread.currentThread().isDaemon())//checking for daemon thread
	    {
		   	System.out.println("Daemon thread work.");
	    }
	   else
	   {
		   System.out.println("User thread work.");
	   }
    }
   public static void main(String[]args)
    {
	   DaemonThreadexample t1=new DaemonThreadexample();//creating thread
	   DaemonThreadexample t2=new DaemonThreadexample();
	   DaemonThreadexample t3=new DaemonThreadexample();
	   t1.setDaemon(true);//now t1 is daemon thread
	   t1.start();//starting threads
	   t2.start();
	   t3.setDaemon(true);
	   t3.start();
    }
 }
