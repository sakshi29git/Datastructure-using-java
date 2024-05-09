package MyDs;

import java.util.Scanner;

public class FibusingRecur {
	int fib(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else if(num==1)
		{
			return 1;
		}
		else {
			return fib(num-1)+fib(num-2);
		}
	}
	
	
	public static void main(String[] args) {
		int num,result;
		Scanner sc=new Scanner(System.in);
		FibusingRecur obj=new FibusingRecur();
		System.out.println("Enter number: ");
		num=sc.nextInt();
		result=obj.fib(num);
		System.out.println("Fib of "+ num + " is: "+result);
		
		
	}

}
