
public class Pattern3 {

	public static void main(String[] args) 
	{
		int p=0;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				
				System.out.print(row-p+" ");
				p++;
			}
			p=0;
			System.out.println();
		}
		
		System.out.println();
		
		
		//down
		
		for(int row=1;row<=5;row++)
		{
			for(int col=row;col>=1;col--)
			{
				
				System.out.print(col+" ");
				
			}
			System.out.println();
		}

	}

}