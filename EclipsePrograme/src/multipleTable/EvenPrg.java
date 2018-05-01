package multipleTable;

import java.util.Scanner;

public class EvenPrg {

	public static void main(String[] args) 
	{
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("This is an Even number");
		}
		else
		{
			System.out.println("This is odd number");
		}
		

	}

}
