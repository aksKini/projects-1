package practice;

import java.util.Scanner;

public class Arrayrev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows in matrix");
		int row =sc.nextInt();
		
		System.out.println("Enter no of columns in matrix");
		int col =sc.nextInt();
		
		int arr[][]=new int[row][col];
		
		System.out.print("Enter "+ row*col +" elements:\n");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j] =sc.nextInt();
			}
		}
		
System.out.println("Elements after loading is:\n");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
