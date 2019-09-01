
public class Pattern7 {

	public static void main(String[] args) 
	{
		for(int row=4;row>=1;row--)
		{
			for(int spc=3;spc>=row;spc--)
			{
				System.out.print(" ");
			}
			
			for(int star1=1;star1<=row;star1++)
			{
				System.out.print("*");
			}
			
			for(int star2=2;star2<=row;star2++)
			{
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}

	}

}
