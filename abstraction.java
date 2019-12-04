package corejava;
abstract class Animal
{
	private String name;
	public Animal(String name)
	{
		this.name=name;
	}
	public abstract void eat();
	public abstract void breathe();
	public String getname()
	{
		return name;
	}
	}
class Racoon extends Animal
{
	public Racoon(String name)
	{
		super(name);
		}
public void eat()
{
	System.out.println(getname()+" is eating");
	}
public void breathe()
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
