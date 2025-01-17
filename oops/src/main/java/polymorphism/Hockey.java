package polymorphism;

public class Hockey extends Football {
	public void spo(String s)
	{
		System.out.println("apple");
	}

	public static void main(String[] args)
	{
		
	 Sports obj;
	 obj= new Sports();
	 obj.spo("sports");
	 obj= new Cricket();
	obj.spo("cricket");
	 obj=new Football();
	obj.spo("football");
	 obj=new Hockey();
	 obj.spo("hockey");
	  

	}

}
