package practice;

import java.util.Scanner;

public class reverseNumb {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number : ");
		int numb=sc.nextInt();
		int rev=0, copy=numb,rem;
		
		while(numb!=0){
			rem=numb%10;
			rev=rev*10+rem;
			numb=numb/10;
		}
		System.out.println("Entered numb is "+copy);
		System.out.println("Reversed number is "+rev);
		
		if(rev==copy){
			System.out.println("number is palindrome");
		}else{
			System.out.println("Number is not palindrome.");
			}
		
		
	}
}


