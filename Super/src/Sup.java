class A
{
	public A()
	{
		System.out.println("In A with no Parameter");
	}
	public A(int i)
	{
		System.out.println("In A with Parameter :"+i);
	}
}
class B extends A
{
	public B()
	{
		super(7);
		System.out.println("In B with no Parameter");
	}
	public B(int i)
	{
		super(i);
		System.out.println("In B with Parameter :"+i);
	}
}

public class Sup {
	public static void main(String args[]) 
	{
		
		B p=new B(5);
		B k= new B();
		
		
	}

}
