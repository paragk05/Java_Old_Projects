

class cal
{
	public int add(int ...i)
	{
		int sum=0;
		for(int n:i)
		{
		sum= sum + n;
		}
		return sum;
		
	}
	
}

public class VarDemo {

	public static void main(String[] args) 
	{
		cal p= new cal();
		int k=p.add(7,5,3,45,7,3,9,44,68,4 );
		System.out.println(k);

	}

}
