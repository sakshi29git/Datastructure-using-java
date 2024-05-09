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

/*In this code we are comparing num1,num2 first which one greater will be stored in the max then compare
 * num3 with max, if c is grater then it will stored in max.
 * 
 * total time complexity- total condition statements two.
 * for best case=O(1)
 * worst case and average case=O(2)
 * 
 * */
