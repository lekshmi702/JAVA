package encapsulation;

public class encap {
	private int age;
	private String name;
	public void setdetail(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	public void getdetail()
	{
		System.out.println(name);
		System.out.println(age);
	}

}
