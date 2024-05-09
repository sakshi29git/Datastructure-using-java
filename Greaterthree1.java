package MyDs;

import java.util.Scanner;

public class Greaterthree1 {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		num1=sc.nextInt();
		
		System.out.println("Enter number2:");
		num2=sc.nextInt();
		
		System.out.println("Enter number3:");
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Num1 is greater...");
		}
		
		else if(num2>num3 && num2>num1)
		{
			System.out.println("Num2 is greater...");
		}
		
		
		else {
			System.out.println("Num3 is greater...");
		}
		
	}

}
