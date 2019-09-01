
public class Pattern6 {

	public static void main(String[] args) 
	{
		for(int row=1;row<=4;row++)
		{
			for(int spc=3;spc>=row;spc--)
			{
				System.out.print(" ");
			}
			
			for(int star=1;star<=row;star++)
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
