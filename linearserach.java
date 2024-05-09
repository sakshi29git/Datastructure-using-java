package MyDs;

import java.util.Scanner;

public class linearserach {
	public static void main(String[] args) {
		int size,i,key;
		boolean found=false;
		int []arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter element one by one: ");
		for(i=0;i<size;i++)
		{
			System.out.println("Enter " + (i+1) + " number:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Element of arra: ");
//		for(i=0;i<size;i++)
//		{
//			System.out.print(arr[i]+"\n");
//		}
		
		System.out.println("Enter element to be search: ");
		key=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Element found at index: " +(i+1));
				found=true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("Sorry element not present in array");
		}
		
		
		
		
	}

}
