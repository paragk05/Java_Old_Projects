
public class Pattern7 {

	public static void main(String[] args) 
	{
		int c=0,col;
		for(int row=1;row<=5;row++)
		{
			if(row%2!=0)
			{
				for(col=1;col<=3;col++)
				{
					c++;
					System.out.print(c+" ");
				}
				
			}
			else
				{
				int temp=c+1;
					for(col=c+3;col>=temp;col--)
					{
						c++;
						System.out.print(col+" ");
					}
					
				}
							
			System.out.println();
		}

	}

}
