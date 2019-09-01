class A
{
	public void show()
	{
		System.out.println("In A");
	}	
}
class B extends A
{
	
	public void show()
	{
		
		System.out.println("In B");
	}
	public void config()
	{
		
		System.out.println("In config");
	}
}

class C extends A
{
	
	public void show()
	{
		
		System.out.println("In C");
	}	
}

public class Dyna {

	public static void main(String[] args) 
	{
		//Compile time polymorphism AND Runtime Polymorphism
		
	//	<Ref of SupClass> <Obj> = new <Object of SubClass>();
		
		A p= new B();    //runtime Polymorphism
		p.show();
		
		p= new C();
		p.show();		//Dynamic Method Dispatch

	}

}
