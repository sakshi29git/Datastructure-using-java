package MyDs;
import java.util.Scanner;

public class Greaternum3 {
	public static void main(String[] args) {
		int num1,num2,num3,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		num1=sc.nextInt();
		
		System.out.println("Enter number2:");
		num2=sc.nextInt();
		
		System.out.println("Enter number3:");
		num3=sc.nextInt();
		
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Number 1 is greater...");
			}
			else {
				System.out.println("Number 3 is greater...");
			}
		}
		else {
			if(num2>num3)
			{
				System.out.println("Number 2 is greater...");
			}
			else 
			{
				System.out.println("Number 3 is greater...");
			}
		}

	}
}

