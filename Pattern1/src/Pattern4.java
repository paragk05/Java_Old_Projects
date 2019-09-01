
public class Pattern4 {

	public static void main(String[] args) 
	{int c=0,col;
		for(int row=1;row<=5;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(col+" ");
				
			}
			c=col;
			for(int n=1;n<row;n++)
				{
				System.out.print(c-2+" ");
				c--;
					
				}
			
			
				c=0;
			
			
			
			System.out.println();
		}

	}

}
