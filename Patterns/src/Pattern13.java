
public class Pattern13 {

	public static void main(String[] args)
	{
		for(int row=1;row<=4;row++)
		{
			for(int star=1;star<=4;star++)
			{
				
				if(row>=2&&star>=2&&row<=3&&star<=3)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
