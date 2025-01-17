package interface1;

public class Child implements SampleInterfaceTest
{
	public void show()
	{
		System.out.println(num);
		System.out.println("implementation 1");
	}
	public void print()
	{
		System.out.println(VALUE);
		System.out.println("implementation2)");
	}

	public static void main(String[] args) {
		SampleInterfaceTest obj= new Child();
		obj.show();
		obj.print();
	

	}

}
