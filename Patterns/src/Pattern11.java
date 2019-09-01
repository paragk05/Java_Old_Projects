
public class Pattern11 {

	public static void main(String[] args) 
	{
		for(int row=1;row<=5;row++)
		{
			
			for(int spc=1;spc<row;spc++)
			{
				System.out.print(" ");
			}
			for(int star1=1;star1<=row;star1++)
			{
				if(star1==row)
				{
					System.out.print("*");
				}
				
			}
			

			for(int spc=4;spc>=row;spc--)
			{
				System.out.print("  ");
			}
			for(int star1=1;star1<=4;star1++)
			{
				if(star1==row)
				{
					System.out.print("*");
				}
				
			}
			
			
			System.out.println();
		}

	}

}
