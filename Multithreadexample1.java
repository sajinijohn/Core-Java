package Multithreads;
class Musicplayer extends Thread
 {
	public void run()
	 {
		 System.out.println("Music is playing");
	 }
 }
class MsWord implements Runnable
 {
	public void run()
	 {		
			System.out.println("Typing Ms Word document");
	 }
 }
public class Multithreadexample1 
 {
	public static void main(String[]args)
	{
      Musicplayer thread1=new Musicplayer();//creating thread for musicplayer class
      Runnable obj1=new MsWord();//can be reference of Runnable interface
	  Thread thread2=new Thread(obj1);//Invokes thread class constructor
      thread1.start();
      thread2.start();
	}
 }
