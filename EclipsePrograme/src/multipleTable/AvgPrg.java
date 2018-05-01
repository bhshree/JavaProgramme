package multipleTable;

import java.util.Scanner;

public class AvgPrg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,num3;
		int sum=0,avg=0;
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		System.out.println("Enter three number..."+num1+","+num2+","+num3);
		sum=num1+num2+num3;
		System.out.println("Summing of all these three number"+sum);
		
		avg=sum/3;
		System.out.println("Finding average of all these three number"+avg);
		

	}

}
