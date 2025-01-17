package exception;

public class Sampleexception {

	public static void main(String[] args)
	{
		int a=10,b=30;
		int s=a+b;
		try
		{
			int result=5/0;
		}
		/*catch (ArithmeticException e)
		{
			System.out.println("division by zero is not possible");
			
		}*/
		finally
		{
			System.out.println(" finaly block will be executed");
		}
		System.out.println("exception program");
		

	}
}


