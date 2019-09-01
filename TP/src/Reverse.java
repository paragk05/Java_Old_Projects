import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		int r,sum=0;
		Scanner p=new Scanner(System.in);
		int n=p.nextInt();
		
		while(n>0) 
		{
			 r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		}
		System.out.println(sum);

	}

}
