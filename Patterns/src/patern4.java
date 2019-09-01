
public class patern4 {

	public static void main(String[] args) 
	{
		for(int row=1;row<=5;row++)
		{
			for(int space=4;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int row=4;row>=1;row--)
		{
			for(int space=4;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
