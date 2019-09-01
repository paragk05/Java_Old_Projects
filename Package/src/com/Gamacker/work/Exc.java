package com.Gamacker.work;

 class Exc {

	public static void main(String[] args) 
	{
		try
		{
			int a[]= new int[6];
			a[6]=8;
			int i=7,j=2;
			float p=i/j;
			System.out.println("No Error ");
		}
		catch(ArithmeticException e)
		{
			System.err.print("Candnot divide with 0 ");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Be in your limit ");
		}
		finally
		{
			System.out.println("Byeeeeeee");			
		}
		

	}

}
