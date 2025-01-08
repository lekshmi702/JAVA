package inheritance;

public class Developer extends Employee {
	String name1="Athira";
			public void display2()
			{
		         System.out.println("name1"+ name1);
			}

	public static void main(String[] args)
	{
		Developer dev=new Developer();
		dev.display2();
		dev.details();
		


	}

}
