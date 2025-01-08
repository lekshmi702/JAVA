package aggregation;

public class Student1 {

	 String name;
	 int rollnumber;
	 Address add;
	 public Student1( String name, int rollnumber,Address add)
	 {
		 this.name=name;
		 this.rollnumber=rollnumber;
		 this.add=add;
	 } 
public void display()
	 {
		System.out.println(add.houseName); 
		System.out.println(add.city); 
		System.out.println(add.houseNumber); 
		System.out.println(add.pincode); 
		System.out.println(name);
		System.out.println(rollnumber); 
		
	 }

	public static void main(String[] args) {
	  Address obj=new Address("obsqura","kochi",12,5678);
	  Student1 obj1= new Student1("athira",18,obj);
	  obj1.display();
	  

	}

}
