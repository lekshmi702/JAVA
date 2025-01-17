package interface1;

public class Circle implements Shape

{
	public void display()
	{
	
		System.out.println("draw triangle");
		System.out.println(VALUE);
	}
	
	public static void main(String args[])
	{
		Shape obj= new Circle();

		obj.display();
		}
		
	}
	
