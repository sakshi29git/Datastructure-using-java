package MyDs;

import java.util.Scanner;

public class fibusingloop {
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n,i,first=0,second=1,next;
			System.out.println("Enter number upto which you want to find fibbonacci series: ");
			n=sc.nextInt();
			for(i=1;i<=n;i++)
			{
				if(n<=1)
				{
					next=i;
				}
				else {
					next=first+second;
					first=second;
					second=next;
				}
				System.out.println(next);
			}
		}

	}



