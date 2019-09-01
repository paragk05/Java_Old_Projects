class ms
{
	int num1,num2;
	
	public ms()
	{
		System.out.println("No Parameters");
	}
	
	public ms(int i)
	{
		System.out.println("The parameter is passed :"+i);
	}
	public ms(int number1,int number2)
	{
		num1 = number1;
		num2 = number2;
		
	}
}
public class Sum 
{
	public static void main(String args[])
	{
		ms obj1 = new ms(); 
		ms obj2,obj3= new ms(5,6);
		
		
		
	
	}
}