package multipleTable;

import java.util.Scanner;

public class SwitchPrg {

	public static void main(String[] args) 
	{  int a=10,b=20,c;
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
		System.out.println("Select The case... :");
		String var=sc.next();
		
		
		switch(var)
		{
		case "add":
			c=a+b;
			System.out.println("Addition Result:"+c);
			break;
			
		case "sub":
			c=a-b;
			System.out.println("Subtractuon is :" +c);
			break;
			
		case "mul":
			c=a*b;
			System.out.println("Multiplication is :" +c);
			break;
			
			default:
			System.out.println("Try Again..");
			break;
		}
		
	}

}
}