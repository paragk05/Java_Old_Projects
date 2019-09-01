class Hi implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e) 
			{

			}
		}
	}

	
}

class Hello implements Runnable
{
	public void run()		//run is a internal method of Thread
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception p) 
			{
	
			}
		}
	}

	
}

public class Intra {

	public static void main(String[] args) {

		Runnable obj1= new Hi();
		Runnable obj2= new Hello();
		
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		
		t1.start();
		//To resolve the collision of both processes,we are just delay one process
		try
		{
			Thread.sleep(10);
		}
		catch (Exception p) 
		{

		}
		t2.start();


	}

}
