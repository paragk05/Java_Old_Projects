@FunctionalInterface
interface Abc
{
	void show();
	
}
public class Func {

	public static void main(String[] args) {
		
		Abc obj=()-> System.out.println("Function Interface");
		
		obj.show();

	}

}
