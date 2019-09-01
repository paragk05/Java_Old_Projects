
public class Pattern9 {

	public static void main(String[] args) 
	{
		for(int row=5;row>=1;row--)
		{
			for(int spc=1;spc<row;spc++)
				System.out.print(" ");
			for(int star=5;star>=1;star--)
			{
				if(star==row)
					System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
