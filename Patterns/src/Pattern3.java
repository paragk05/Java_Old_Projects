
public class Pattern3 {

	public static void main(String[] args)
	{
		for(int row=5;row>=1;row--)
		{
			for(int star=1;star<=row;star++)
			{
				System.out.print("*");
			}
			
			for(int col=4;col>=row;col--)
			{
				System.out.print(" ");
			}	
			
				
			
			
			System.out.println();

			
		}

	}

}
