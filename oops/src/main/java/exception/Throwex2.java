package exception;

import java.io.IOException;

public class Throwex2 {
	public static  void test()throws IOException
	{
		throw new IOException();
		
	}

	public static void main(String[] args) {
		
	try {
		test();
	} catch (IOException e) {
	
		e.printStackTrace();
	}

	}

}
