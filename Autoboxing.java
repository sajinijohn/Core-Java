package Wrapper;

public class Autoboxing {
	public static void main(String[]args)
	{
    Integer i=20;//converting int to integer	
    Integer j=i;//autoboxing now compiler will write integer.valueOf(a) internally
    System.out.println(i+" "+j);
	}

}
