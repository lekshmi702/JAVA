package superkeyword;

public class Child extends Parent 
{
	public Child( String name)
	{
		super("appu");
		System.out.println(name);
		System.out.println("child constructor");
	}
	String color="green";
	public void show()
	{
		System.out.println(color);
		System.out.println("child class method"); 
		System.out.println(super.color);
		super.show();
	}
	

	public static void main(String[] args) {
		Child c= new Child( "athira");
		c.show();
	

	}

}
