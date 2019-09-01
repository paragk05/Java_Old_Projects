class Outer
{
	class Inner
	{
		public void show()
		{
			System.out.println("In normal Iner class");
		}
	}
	static class Innsta
	{
		public void display()
		{
			System.out.println("In Static Inner class");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) 
	{
		Outer obj =new Outer();
		Outer.Inner p= obj.new Inner();
		p.show();
		
		Outer.Innsta k= new Outer.Innsta();
		k.display();
		
	}

}
