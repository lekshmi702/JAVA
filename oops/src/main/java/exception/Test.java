package exception;

public class Test {
	public void check(int age)throws LicenceException
	{
		if(age<18)
		{ throw new LicenceException("Not eligible");
		
		}
		else
		{
			System.out.println("eligible");
		}
	}
		

	public static void main(String[] args) {
	Test t=new Test();
	try
	{
		t.check(17);
	}
	catch(LicenceException e)
	{
		System.out.println(e);
	}

	}

}
