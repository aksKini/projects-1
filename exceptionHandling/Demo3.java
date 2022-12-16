package exceptionHandling;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("main starts...");
		int[] arr={10,20,30,40};
		System.out.println(arr[1]);
		try{
//		System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException handled...");
		}
		System.out.println("main ends...");
	                                         
	}

}
