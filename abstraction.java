package corejava;
abstract class Animal//abstract class
{
	private String name;
	public Animal(String name)
	{
		this.name=name;
	}
	public abstract void eat();//abstract method
	public abstract void breathe();//abstract method
	public String getname()
	{
		return name;
	}
 }
class Racoon extends Animal//Inherited class
{
	public Racoon(String name)
	{
		super(name);
	}
        public void eat()//abstract class definition
        {
	System.out.println(getname()+" is eating");
	}
        public void breathe()//abstract class definition
        {
	System.out.println("Breathe in,braethe out,repeat");
	}

}
public class abstraction {
	public static void main(String[]args)
	{
		Racoon racoon=new Racoon("Racoon");
		racoon.eat();
		racoon.breathe();
	}
}
