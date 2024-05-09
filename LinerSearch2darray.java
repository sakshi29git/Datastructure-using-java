package MyDs;

import java.util.Scanner;

public class LinerSearch2darray {
public static void main(String[] args) {
	int row,col,key,i,j,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of row: ");
	row=sc.nextInt();
	System.out.println("Enter size of col: ");
	col=sc.nextInt();
	int a[][]=new int[row][col];
	System.out.println("Enter element in 2D array: ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter element to be search in array: ");
	key=sc.nextInt();
	c=0;
	for(i=0;i<row;i++)
	for(j=0;j<col;j++)
	{
	if(a[i][j]==key)
	{
	System.out.println("Element present at location: row:" +(i+1)+" coloumn: "+(j+1) );
	c++;
	break;
	}
	}
	if(c==0)
	{
		System.out.println("Sorry element not found in array");
	}

}
}
