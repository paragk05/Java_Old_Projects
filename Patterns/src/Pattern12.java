
public class Pattern12 {

	public static void main(String[] args) 
	{
		for(int row=1;row<=5;row++)
		{
			for(int spc=1;spc<row;spc++)
				System.out.print(" ");
			for(int str1=1;str1<=row;str1++)
				if(str1==row)
					System.out.print("*");
			
			for(int spc=5;spc>row;spc--)
				System.out.print("  ");
			for(int str2=1;str2<=4;str2++)
				if(str2==row)
					System.out.print("*");
			
			
			
			
			
			System.out.println();
		}
		
		for(int row=1;row<=5;row++)
		{
			for(int spc=4;spc>row;spc--)
				System.out.print(" ");
			for(int str2=1;str2<=4;str2++)
				if(str2==row)
					System.out.print("*");
			
			for(int spc=1;spc<=row;spc++)
				System.out.print("  ");
			for(int str1=1;str1<=4;str1++)
				if(str1==row)
					System.out.print("*");
				
			
			System.out.println();
		}

	}

}
