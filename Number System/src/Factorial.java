import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int fact=1,sum=0;
		Scanner p=new Scanner(System.in);
		int n=p.nextInt();
		for (int i = n; i >=1; i--) 
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		

	}

}
