package aggregation;

public class Author {
	String name;
	 int age;
	 Book add;
	 public Author( String name, int age,Book add)
	 {
		 this.name=name;
		 this.age=age;
		 this.add= add;
	 } 
public void display()
	 {
		System.out.println(add.bkName); 
		System.out.println(add.bkprice);  
		System.out.println(name);
		System.out.println(age); 
	 }
	

	public static void main(String[] args) 
	{

			  Book obj=new Book("ninte ormayk",60);
			  Author obj1= new Author("Basheer",55,obj);
			  obj1.display();
			  

}

}


