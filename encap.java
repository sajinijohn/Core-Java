package corejava;

public class encap {
	String name;
	 String address;
	String ph;
	String email;
	String ptype;
	String pid;
	public void setname(String name) 
	{
		this.name=name;
	}
	public void setadd(String address) 
	{
		this.address=address;
	}
	public void setphone(String ph) 
	{
		this.ph=ph;
	}
	public void setemail(String email) 
	{
		this.email=email;
	}
	public void setprooft(String ptype) 
	{
		this.ptype=ptype;
	}
	public void setproofid(String pid) 
	{
		this.pid=pid;
	}
	public String getname() 
	{
		return this.name;
	}
	public String getadd() 
	{
		return this.address;
	}
	public String getphone() 
	{
		return this.ph;
	}
	public String getemail() 
	{
		return this.email;
	}
	public String getprooft() 
	{
		return this.ptype;
	}
	public String getproofid() 
	{
		return this.pid;
	}
}
