package exception;

public class Throwsample {
	public static  void add(int a,int b)
	{
		int sum=a+b;
		if(sum<50)
		{
			throw new ArithmeticException("exception occured");
		}
		else
		{
			System.out.println("sum greater than 50");
		}
		
	}

	public static void main(String[] args) {
		
	try
	{
		add(10,20);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("rest of the code");

	}

}
