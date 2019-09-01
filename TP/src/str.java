import java.util.Scanner;

public class str {

	public static void main(String[] args) 
	{
		int sp=0,ch=0;
		Scanner s= new Scanner(System.in);
		String p=s.nextLine();
		char ttt[]=p.toCharArray();
		
		System.out.println(p.length());
		for(char c: ttt)
		{
			if(c==' ')
			{
				sp++;
			}
			else
			{
				ch++;
			}
		}
		System.out.println("The total charachers are :"+ch+" \nand total spaces are :"+sp);

	}

}
