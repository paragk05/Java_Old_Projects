
public class Pattern6 {
	public static void main(String a[])
	{
		for(int row=1;row<=5;row++)
		{
			int n=row;
			for(int col=1;col<=row;col++)
			{
				System.out.print(n+" ");
				n=n+5-col;
			}
			
			System.out.println();
		}

	}

}
