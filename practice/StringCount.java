package practice;

import java.util.Scanner;

public class StringCount {
		  public static void main(String[] args) {    
				Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String : ");
				String string=sc.nextLine();
		       
		        int count = 0, space=0;    
		            
		        //Counts each character except space    
		        for(int i = 0; i < string.length(); i++) {    
		            if(string.charAt(i) != ' '){    
		                count++;    
		            }else{
		            	space++;
		            }
		        }    
		            
		        //Displays the total number of characters present in the given string    
		        System.out.println("Total number of characters in a string: " + count);    
		        System.out.println("Total number of space in a string: " + space);    
		    }    
	}


