package practice;

import java.util.Arrays;
import java.util.Scanner;

public class revstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
			String str=sc.nextLine();
			String rev="";
			String arr[]=str.split(" ");                  
			System.out.println(Arrays.toString(arr));
			
			int s=1;
			int e=arr.length-1;
			while(s<e)
			{
				String temp=arr[s];
				arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
				
				
			}
			System.out.println(Arrays.toString(arr));
				
	     }
			
	}


