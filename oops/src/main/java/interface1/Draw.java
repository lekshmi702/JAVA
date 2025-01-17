package interface1;
public class Draw implements Shape
{
	
      public void display()
      {
    	  System.out.println("draw triangle");
    	  System.out.println(num);
      }
		
	
public static void main(String args[])
{
    Shape obj= new Draw();
    
    obj.display();
}
}

		
	



		
	



