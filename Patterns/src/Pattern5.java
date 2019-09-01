
public class Pattern5 {

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
				System.out.print("* ");
			}
		
			
			System.out.println();
		}

	}

}
