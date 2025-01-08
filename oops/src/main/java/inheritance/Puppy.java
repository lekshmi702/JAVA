package inheritance;

public class Puppy extends Dog {
	String name2="tom";
	public void speed()
	{
		System.out.println("name2" + name2);
		
	}


	public static void main(String[] args) {
		Puppy obj=new Puppy();
		obj.color();
		obj.bark();
		obj.speed();
	

	}

}
