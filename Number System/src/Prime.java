import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		int n,count=0;
		Scanner p= new Scanner(System.in);
		System.out.print("Enter number :");
		
		n=p.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if (count==2) 
		{
			System.out.println("Prime");
		} 
		else 
		{
			System.out.println("Not Prime");

		}

	}

}
