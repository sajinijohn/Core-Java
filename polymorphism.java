package corejava;
 class area
{
	public void findarea(int side)
	{
		System.out.println("area of Square "+side*side);
	}
	public void findarea(int length,int breadth)
	{
		System.out.println("area of Rectangle "+length*breadth);
	}
	public void findarea(float base,int height)
	{
		System.out.println("area of Triangle "+0.5*base*height);
	}
	public void findarea(int base,float height)
	{
		System.out.println("area of Parallelogram"+base*height);
	}
	}
public class polymorphism {
	public static void main(String[]args)
	{
		area Area=new area();
		Area.findarea(5);
		Area.findarea(10,15);
		Area.findarea(12.5f,8);
		Area.findarea(8,12.5f);
	}
}
