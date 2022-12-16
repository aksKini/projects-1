package practice;

import java.util.Arrays;

public class MinInArray {
	public static void main(String[] args) {
		int[] arr={10,30,50,20,5};
		Arrays.sort(arr);
		System.out.println("Sorted array is : ");
		 for (int num : arr) {
	            System.out.print(num + " ");
	        }
		 System.out.println();
		 System.out.println("minimum number is "+arr[0]);
		 System.out.println("maximum number is "+arr[arr.length-1]);
		
	}

}
