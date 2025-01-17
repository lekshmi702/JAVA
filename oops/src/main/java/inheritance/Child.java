package inheritance;

import polymorphism.Parent;

public class Child extends Parent
{
	 public void print(String n)
	 {
		  System.out.println("child class");
	 }

	public static void main(String[] args)
	{
	  Child c=new Child();
	  Parent  p=new Parent();
	  c.print("hai");
	  p.print("lekshmi");

	}

}
