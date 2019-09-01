class A
{
	public void show()
	{
		System.out.println("In A");
	}	
}
class B extends A
{
	@Override
	public void show()
	{
		super.show();
		System.out.println("In B");
	}	
}


public class Over
{

	public static void main(String[] args) 
	{
		B p= new B();
		p.show();

	}

}
