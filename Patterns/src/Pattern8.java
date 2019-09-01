
public class Pattern8 {

	public static void main(String[] args) 
	{
		
		for(int row=1;row<=5;row++)
		{
			for(int spc=2;spc<=row;spc++)
			System.out.print(" ");
				
			for(int star=1;star<=row;star++)
				{
					
					if(star==row)
					{
						System.out.print("*");
		
					}
				}
			
			
			System.out.println();
		}
		

	}

}
