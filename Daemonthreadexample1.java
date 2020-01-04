package Multithreads;
public class Daemonthreadexample1 extends Thread
 {
   public void run()
    {
	   System.out.println("Thread name: "+Thread.currentThread().getName());
	   System.out.println("check if its DaemonThread: "+Thread.currentThread());
    }
   public static void main(String[]args)
    {
	   Daemonthreadexample1 t1=new Daemonthreadexample1();
	   Daemonthreadexample1 t2=new Daemonthreadexample1();
	   t1.start();
	   //Exception as the thread is already started
	   t1.setDaemon(true);
	   t2.start();
    }
 }
