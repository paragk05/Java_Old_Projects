class Cla
{
	int n1,n2,result;
	
	public void perform()
	{
		result=n1+n2;
	}
}

public class Obj 
{
	public static void main(String args[]) 
	{
		Cla c = new Cla();
		
		c.n1=10;
		c.n2=15;
		c.perform();
		System.out.println(c.result);
		
		
		
	}

}
