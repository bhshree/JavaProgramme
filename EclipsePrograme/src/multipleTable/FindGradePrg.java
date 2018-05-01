package multipleTable;

import java.util.Scanner;

public class FindGradePrg {

	public static void main(String[] args) 
	{
		int marks[]=new int[5];
		int i;
		float sum=0,avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 Subject");
		for(i=0;i<=5;i++)
		{
			marks[i]=sc.nextInt();
			sum=sum+marks[i];
		}
		
		avg=sum/5;
		System.out.println("Your grade is :");
		if(avg>80)
		{
			System.out.println(" A");
		}
		else if(avg>60 && avg<=80)
		{
			System.out.println(" B");
		}
		else if(avg>40 && avg<60)
		{
			System.out.println(" c");
		}
		else if(avg<=35 && avg>=40)
		{
			System.out.println("D");
		}
	}

}
