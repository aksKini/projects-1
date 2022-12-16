package practice;

import java.util.Scanner;

public class Mock1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String str=sc.nextLine();
		int count=0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)!=' '){
				count++;
			}
		}
		
		StringBuilder sbr=new StringBuilder(str);
		System.out.println("String after reverse is :\n"+sbr.reverse());
		System.out.println("no of characters in string "+str+" is: "+count);

}
}
