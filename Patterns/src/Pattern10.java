
public class Pattern10 {

	public static void main(String[] args) 
	{
		for(int row=1;row<=5;row++)
		{
			for(int spc=4;spc>=row;spc--)
				System.out.print(" ");
			for(int star1=1;star1<=row;star1++)
			{
				if(star1==row)
					System.out.print("*");
				
			}
			
			for(int spc1=1;spc1<row;spc1++)
				{
					System.out.print("  ");
				}
			for(int star2=2;star2<=row;star2++)
			{	
				if(star2==row)
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
