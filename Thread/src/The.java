class Mythread extends Thread
{
	int a[]= {2,5,3,85,5};
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			a[i]=a[i]*2;
			System.out.println(a[i]);
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e) 
			{
				
			}
		}
	}
	
}


public class The {

	public static void main(String[] args) {
		
		Thread s=new Mythread();
		s.run();

	}

}
