package encapsulation;

public class flower {
	private int numb;
	private String name;
	public void etdetail(int numb, String name)
	{
		this.numb=numb;
		this.name=name;
	}
	public void getdetail()
	{
		System.out.println(name);
		System.out.println(numb);

}
}
