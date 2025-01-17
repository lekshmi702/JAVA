package interface1;

public class Child  implements Interface3,Interface4
{
  public void print()
  {
	  System.out.println("hello");
	  System.out.println(MAX_VALUE);
  }
  public void show()
  {
	  System.out.println("world");
	  System.out.println(MIN_VALUE);
  }
	public static void main(String[] args) {
		Child c=new Child();
		c. show();
		c.print();
	

	}

}
