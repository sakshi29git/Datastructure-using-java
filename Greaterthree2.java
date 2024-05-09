package MyDs;
import java.util.Scanner;

public class Greaterthree2 {
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
			max=num1;
		}
		else {
			max=num2;
		}
		
		if(num3>max)
		{
			max=num3;
		}
		
		
		System.out.println("Maximum number: "+max);
		
		
	}

}

