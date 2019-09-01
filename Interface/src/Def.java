@FunctionalInterface
interface demo
{
	void abc();
	default void show()
	{
		System.out.println("In show");
	}
	
}
class DemoImp implements demo
{
	public void abc()
	{
		System.out.println("In ABC");
	}
	public void show()
	{
		System.out.println("In new Show");
	}
}


public class Def {

	public static void main(String[] args) {
		demo obj= new DemoImp();
		obj.abc();
		obj.show();
		
	}

}
