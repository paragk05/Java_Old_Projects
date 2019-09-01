public class ThreadLamda {

	public static void main(String[] args) throws Exception
	{

		
		
		Thread t1= new Thread(() -> 
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
		

		
	});
		Thread t2= new Thread(()->		//run is a internal method of Thread
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
		

	});
		
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
		
		t1.join();
		t2.join();
		System.out.println("Bye");


	}

}

