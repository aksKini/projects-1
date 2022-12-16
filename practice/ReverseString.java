package practice;

import java.util.Scanner;


public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String str=sc.nextLine();
		
//		StringBuilder sbr=new StringBuilder(str);
//		System.out.println("String after reverse is :\n"+sbr.reverse());
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			
			rev=rev+ str.charAt(i);
		}
		System.out.println(rev);
	}
}

        